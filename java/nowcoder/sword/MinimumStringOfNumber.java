/**
 * get the minimum number combination in array 
 */
package nowcoder.sword;

import java.util.*;

public class MinimumStringOfNumber {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null){
            return null;
        }
        ArrayList<String> result = new ArrayList<>();
        recur(numbers,"",result);
        Collections.sort(result);
        return result.get(0);
    }
 
    public void recur(int[] numbers, String cur, ArrayList<String>result){
        if(numbers.length == 0){
            for(int i = 0; i < result.size();i++){
                if(result.get(i) == cur){
                    return;
                }
            }
            result.add(cur);
        }
 
        for(int i = 0; i < numbers.length; i++){
            int[] temp = new int[numbers.length-1];
            int count = 0;
            for(int j = 0; j < numbers.length;j++){
                if(j != i){
                    temp[count] = numbers[j];
                    count++;
                }
            }
            //将不同的数字组合成一个字符串
            recur(temp,cur+Integer.toString(numbers[i]),result);
        }
    }
}