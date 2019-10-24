#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <memory.h>

int main(int argc,char *argv[]){
    if(argc<2){
        printf("usage:%s fifo\n",argv[0]);
        exit(1);
    }
    printf("Open file write..\n");
    int fb=open(argv[1],O_WRONLY);
    if(fb<0){
        perror("Open error");
        exit(1);
    }else
    {
        printf("Open fifo success:%d\n",fb);
    }
    char *s="123456789";
    size_t size=strlen(s);
    if(write(fb,s,size)!=size){
        perror("write error");
    }
    close(fb);
    exit(0);    
}