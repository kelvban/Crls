/**
 * Find two numbers whose sum is the target number, and the product is the smallest 
 */
package nowcoder.sword;
import java.util.*;
class FindMinProduct{
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int target) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int i=0;
        int j=array.length-1;
        while(i<j){
            int sum=array[i]+array[j];
            if(sum==target){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return list;
    }
}