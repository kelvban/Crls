#include <sys/shm.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <sys/wait.h>

#include "tell.h"

int main(void){
    //创建共享内存
    int shmid;
    if((shmid=shmget(IPC_PRIVATE,1024,IPC_CREAT|IPC_EXCL|0777))<0){
        perror("shmget error");
        exit(1);
    }
    __pid_t pid;
    init();
    if((pid=fork())<0){
        perror("fork error");
        exit(1);
    }else if (pid>0)
    {
        //进行共享内存的映射
        int *pi=(int*)shmat(shmid,0,0);
        if(pi==(int*)-1){
            perror("shmat error");
            exit(1);
        }
        //往共享内存中写入数据
        *pi=100;*(pi+1)=200;
        //操作完毕，解除映射
        shmdt(pi);
        //通知子进程读取数据
        notify_pipe();
        //
        destroy_pipe();
        wait(0);
    }else
    {
        //子进程阻塞，等待父进程写入
        wait_pipe();
        //子进程从共享内存中读取数据
        //子进程进行共享内存映射
        //进行共享内存的映射
        int *pi=(int*)shmat(shmid,0,0);
        if(pi==(int*)-1){
            perror("shmat error");
            exit(1);
        }
        printf("start:%d end:%d\n",*pi,*(pi+1));
        shmdt(pi);
        //删除共享内存
        shmctl(shmid,IPC_RMID,NULL);
        destroy_pipe();
    }
    
    exit(0);
}