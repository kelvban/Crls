#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <string.h>

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
    } else if (pid>0)
    {
        sleep(5);// 等待子进程将写端关闭，构成不完整管道
        close(fb[1]);
        while(1){
            char c;
            if(read(fb[0],&c,1)==0){
                printf("\nwrite-end of pipe closed\n");//读完了
                break;
            }else
            {
                printf("%c",c);
            }   
        }
        close(fb[0]);
        wait(0);
    }else
    {
        close(fb[0]);
        char *s="abcd";
        write(fb[1],s,sizeof(char))!=sizeof(char);
        close(fb[1]);
    }
    
    exit(0);
}