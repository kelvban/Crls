/**
 * return the max num in every sliding window
 */
package nowcoder.sword;

import java.util.ArrayList;

public class MaxNumInSlidingWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> results=new ArrayList<>();
        
        if(num==null||num.length<1){
            return null;
        }
        for(int i=0;i<num.length-size+1;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=i;j<i+size;j++){
                temp.add(num[j]);
            }
            results.add(getMaxNum(temp)); 
        }
        if(size<1||size>num.length){
            results.clear();
        }
        return results;
    }
    public Integer getMaxNum(ArrayList<Integer> temp){
        Integer maxNum=0;
        if(temp!=null){
            for(Integer n:temp){
                if(n>=maxNum){
                    maxNum=n;
                }
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,2,6,2,5,1};
        MaxNumInSlidingWindow maxNumInSlidingWindow=new MaxNumInSlidingWindow();
        ArrayList<Integer> results=maxNumInSlidingWindow.maxInWindows(arr, 3);
        System.out.println(results.toString());
    }
}