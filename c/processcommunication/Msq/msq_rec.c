#include <stdio.h>
#include <stdlib.h>
#include <sys/msg.h>

typedef struct
{
    long type;
    int start;
    int end;
}MSG;

int main(int argc,char *argv[]){
    if(argc<3){
        printf("usage:%s key\n",argv[0]);
        exit(1);
    }
    key_t key=atoi(argv[1]);
    long type=atoi(argv[2]);

    //获得指定的消息队列
    int msq_id;
    if((msq_id=msgget(key,0777))<0){
        perror("msgget error");
    }
    printf("msg id:%d\n",msq_id);

    MSG m;
    if(msgrcv(msq_id,&m,sizeof(MSG)-sizeof(long),type,IPC_NOWAIT)<0){
        perror("msgrcv error");
    }else
    {
        printf("type:%d start:%d end:%d\n",m.type,m.start,m.end);
    }
    exit(0);

    
}