/**
 * judge numbers if those are continuous
 */
import java.util.*;
 class PokeIsContinuous{
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0||numbers==null){
            return false;
        }
        int zero=0;
        ArrayList<Integer> numberArray=new ArrayList<Integer>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                zero++;
            }else{
                numberArray.add(numbers[i]);
            }
        }
        Collections.sort(numberArray);
        if(zero==4){
            return true;
        }
        if(zero==3){
            int a=numberArray.get(0);
            int b=numberArray.get(1);
            if(Math.abs(a-b)<=4&&Math.abs(a-b)>=0){
                return true;
            }
        }
        if(zero==2||zero==1){
            int cs_1=0;
            int cs_2=0;
            for(int i=1;i<numberArray.size();i++){
                if((numberArray.get(i)-numberArray.get(i-1))==1){
                    cs_1++;
                }
                if((numberArray.get(i)-numberArray.get(i-1))==2){
                    cs_2++;
                }
            }
            if(zero==2){
                if(cs_1==2||cs_2==2){
                    return true;
                }
            }else{
                if((cs_1==2&&cs_2==1)||(cs_1>2)){
                    return true;
                }
            }
        }
        if(zero==0){
            int count=0;
            for(int i=1;i<numberArray.size();i++){
                if((numberArray.get(i)-numberArray.get(i-1))==1){
                    count++;
                }
            }
            if(count==4){
                return true;
            }
        }
        return false;
    }
 }