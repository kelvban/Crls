#!/bin/bash
cat $1 | tr -s ' ' '\n'| sort | uniq -c | sort -r | awk '{print $2,$1}'