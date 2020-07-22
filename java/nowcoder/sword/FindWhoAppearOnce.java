/**
 * find two nums in the array who just appear once
 */
import java.util.*;

public class FindWhoAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
           Arrays.sort(array);
           Stack<Integer> s=new Stack<Integer>();

           for(int i=0;i<array.length;i++){
               if(s.empty()||s.peek()!=array[i]){
                   s.push(array[i]);
               }else{
                   s.pop();
               }
           }
           num1[0]=s.pop();
           num2[0]=s.pop();
    }
}