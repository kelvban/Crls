import java.util.PriorityQueue;

/**
 * Get the median of the Data Stream
 */
import java.util.*;
public class GetTheMedian {
    public PriorityQueue<Integer> max=new PriorityQueue<Integer>(new Comparator<Integer>(){
        public int compare(Integer o1, Integer o2){
            return o2 - o1;
        }
    });
    PriorityQueue<Integer> min=new PriorityQueue<Integer>();
    int flag=1;
    public void Insert(Integer num) {
        if(flag==1){
            if(!min.isEmpty()&&num>min.peek()){
                min.add(num);
                num=min.poll();
            }
            max.add(num);
            flag=1-flag;
        }else{
            
            if(!max.isEmpty()&&num<max.peek()){
                max.add(num);
                num=max.poll();
            }
            min.add(num);
            flag=1-flag;
        }
    }

    public Double GetMedian() {
        
        return(max.size()>min.size()?1.0*max.peek():((double)min.peek()+(double)max.peek())/2);
    }

    // public static void main(String[] args) {
    //     int [] arr={6,5,4,9,1};
    //     GetTheMedian getTheMedian=new GetTheMedian();
    //     for(int i=0;i<arr.length;i++){
    //         getTheMedian.Insert(arr[i]);
    //     }
    //     Double result=getTheMedian.GetMedian();
    //     System.out.println(result);
            
        
    // }
}