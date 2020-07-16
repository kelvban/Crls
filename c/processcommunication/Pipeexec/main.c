#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>  
#include <sys/wait.h>

char *cmd1[3]={"/bin/cat","/etc/passwd",NULL};
//char *cmd2[3]={"/bin/grep","root",NULL};
char *cmd2[3]={"wc","-l",NULL};

int main(void){
    int fb[2];
    if(pipe(fb)<0){
        perror("pipe error");
        exit(1);
    }
    int i=0;
    __pid_t pid;
    for (;i<2;i++){
        pid=fork();
        if(pid<0){
            perror("fork error");
            exit(1);
        }else if (pid==0) //child process
        {
            if(i==0){ //write
            close(fb[0]);
            //将标准输出（屏幕）重定向到管道写端
            if(dup2(fb[1],STDOUT_FILENO)!=STDOUT_FILENO){
                perror("dup2 error");
            }
            close(fb[1]);
            if(execvp(cmd1[0],cmd1)<0){
                perror("execvp error");
                exit(1);
            }
                break;
            }
            if(i==1){ //read
                close(fb[1]);
                //将标准输入重定向到管道读端
                if(dup2(fb[0],STDIN_FILENO)!=STDIN_FILENO){
                    perror("dup2 error");
                }
                close(fb[0]);
                if(execvp(cmd2[0],cmd2)<0){
                perror("execvp error");
                exit(1);
            }
                break;
            }
        }else
        {
            if(i==1){
                close(fb[0]);
                close(fb[1]);
                wait(0);
                wait(0);
            }
        }
        
        
    }
    
    exit(0);
}