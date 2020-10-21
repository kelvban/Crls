/**
 * find the minimum number k of them
 */

package nowcoder.sword;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNumberKOfThem {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<>();
        if(input.length>=k&&k>0){
            Arrays.sort(input);
            for(int i=0;i<k;i++){
                result.add(input[i]);
            }
        }
        return result;
    }
}