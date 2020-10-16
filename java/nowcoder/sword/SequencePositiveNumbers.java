/**
 * find sequence of continuous positive integers with sum s
 */
package nowcoder.sword;

import java.util.ArrayList;

class SequencePositiveNumbers {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
       for(int i=1;i<sum;i++){
           int temp=0;
           int j=i;
           while(temp<sum){
               temp+=j;
               j++;
           }
           if(temp==sum){
               ArrayList<Integer> sequence=new ArrayList<Integer>();
               for(int k=i;k<j;k++){
                   sequence.add(k);
               }
               result.add(sequence);
           }
       }
       return result;
    }
}