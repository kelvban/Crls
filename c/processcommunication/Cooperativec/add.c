#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/types.h>  
#include <sys/wait.h>

int main(void){
    int x,y;
    if(read(STDIN_FILENO,&x,sizeof(int))<0){
        perror("read error");
    }
    if(read(STDIN_FILENO,&y,sizeof(int))<0){
        perror("read error");
    }
    int result=x+y;
    if(write(STDOUT_FILENO,&result,sizeof(int))!=sizeof(int)){
        perror("write error");
    }
    exit(0);
}