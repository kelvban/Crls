#!/bin/bash
awk '
{
    for(i=1;i<=NF;i++){
        if(NR==1){
            s[i]=$i;
        }
        else{
            s[i]=s[i]" "$i;
        }
        # print $i;
        # print "---------";

    }
}
END{
    for(i=1;s[i]!="";i++){
        print s[i];
    }
}
' $1