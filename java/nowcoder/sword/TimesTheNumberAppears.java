/**
 * Get the number of times the number appears
 */
package nowcoder.sword;
import java.util.*;
class TimesTheNumberAppears{
    public int GetNumberOfK(int [] array , int k) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                if(map.containsKey(array[i])){
                    int value=map.get(array[i]);
                    ++value;
                    map.put(array[i],value);
                }else{
                    int value=1;
                    map.put(array[i],value);
                }
            }
        }
         if(map.containsKey(k)){
             result=map.get(k);
             return result;
         }
        return result;
    }
}