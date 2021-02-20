#!/bin/bash
# line=$(cat $1 | wc -l)
# if [ $line -ge 10 ]; then
#     cat $1 | head -n 10 | tail -n 1
# fi

#awk "NR==10" $1;

tail -n +10 $1 | head -n 1