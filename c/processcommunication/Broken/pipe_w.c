#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <signal.h>
#include <errno.h>
#include <stdlib.h>
#include <string.h>



void  my_sig(int signo){
    if(signo==SIGPIPE){
        printf("SIGPIPE occured\n");
    }
}
int main(void){
    int fb[2];
    if(pipe(fb)<0){
        perror("pipe error");
        exit(1);
    }
    pid_t pid;
    if((pid=fork())<0){
        perror("fork error");
        exit(1);
    }else if(pid>0){
        //父进程向不完整管道写入数据
        sleep(5);
        close(fb[0]);
        if(signal(SIGPIPE,my_sig)==SIG_ERR){
            perror("signal sigpipe error");
            exit(1);
        }
        char *s="abcd";
        if(write(fb[1],s,sizeof(s))!=sizeof(s)){
            fprintf(stderr,"%s,%s\n",strerror(errno),(errno==EPIPE)?"EPIPE":"unkonw");
        }
        close(fb[1]);
        wait(0);
    }else{
        close(fb[0]);
        close(fb[1]);
    }
}