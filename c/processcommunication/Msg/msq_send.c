#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/msg.h>


typedef struct{
long type; //消息类型
int start; //消息数据本身（start and end）
int end; 
}MSG;

/*
 *往消息队列中传递消息
 */
int main(int argc,char *argv[]){
if(argc<2){
printf("usage:%s key\n",argv[0]);
exit(1);
}
key_t key=atoi(arv[1]);
printf("key:%d\n",key);

//创建消息队列
int msq_id;
if((msq_id=msgget(key,IPC_CREATE|IPC_EXCL|0777))<0){
perror("msgget error");
printf("msq_id:%d\n",msq_id);
exit(0);
}
