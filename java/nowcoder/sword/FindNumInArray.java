



/**
 * There is a number in the array that appears more than half the length of the array. 
 * Please find this number.
 */
package nowcoder.sword;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class FindNumInArray {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int half = array.length / 2;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[half])
                count++;
        }
        if (count > half)
            return array[half];
        else
            return 0;
    }
    
    public static void main(String[] args) {
        FindNumInArray findNumInArray=new FindNumInArray();
        int [] array={2,3,2,2,2,5,4};
        int result=findNumInArray.MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }
}
