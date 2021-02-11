package others;
import java.util.*;
public class GetNumberOfJuice {
    public static void getNumberOfJuice(List<Integer> nums){
        int[] results=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int count=0;
            int n=nums.get(i);
            while(n/3>0){
                count+=n/3;
                n=n/3+n%3;
                if(n==2){
                    count+=1;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> nums=new ArrayList<>();
        while(!sc.hasNext("0")){
            nums.add(sc.nextInt());
        }
        getNumberOfJuice(nums);
    } 
}