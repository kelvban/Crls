#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <memory.h>
#include <unistd.h>


int main(int agrc,char *argv[]){
    if(agrc<2){
        printf("usage:%s fifo\n",argv[0]);
        exit(1);
    }
    printf("Open fifo read...\n");
    int fb=open(argv[1],O_RDONLY);
    if(fb<0){
        perror("Open error");
        exit(1);
    }else
    {
        printf("Open file success:%d\n",fb);
    }
    char buf[512];
    memset(buf,0,sizeof(buf));
    while (read(fb,buf,sizeof(buf))<0){
        perror("Read error");
    }
    printf("%s\n",buf);
    close(fb);
    exit(0);
}