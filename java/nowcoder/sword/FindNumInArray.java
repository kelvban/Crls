import java.util.HashMap;
import java.util.Map;



/**
 * There is a number in the array that appears more than half the length of the array. 
 * Please find this number.
 */
public class FindNumInArray {
    public int MoreThanHalfNum_Solution(int [] array) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.get(array[i])>(array.length/2)){
                result=array[i];
                break;
            }
            else if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            }
            else{
                int temp=map.get(array[i]);
                temp++;
                map.put(array[i], temp);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FindNumInArray findNumInArray=new FindNumInArray();
        int [] array={2,3,2,2,2,5,4};
        int result=findNumInArray.MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }
}
