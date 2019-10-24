#ifndef _TELL_H_
#define _TELL_H_
#include <stdlib.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <stdio.h>
#include "tell.h"

static int fb[2];

//管道初始化
void init(){
    if(pipe(fb)<0){
        perror("pipe error");
    }
}
//利用管道进行等待
void wait_pipe(){
    //默认管道是阻塞
    char c;
    if(read(fb[0],&c,1)<0){
        perror("read error");
    }
}
//利用管道进行通知
void notify_pipe(){
    char c='c';
    if(write(fb[1],&c,1)!=1){
        perror("notify error");
    }
}
//销毁管道
void destroy_pipe(){
    close(fb[0]);
    close(fb[1]);
}

#endif
