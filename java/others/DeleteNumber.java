package others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javafx.collections.ListChangeListener;
class ListNode{
    int val=0;
    ListNode next=null;
    public ListNode(int val){
        this.val=val;
    }
}
public class DeleteNumber {
    // public static int deleteNumber(int[] nums){
    //     int result=0;
    //     ListNode hNode=new ListNode(-1);
    //     ListNode tNode=hNode;
    //     for(int i=0;i<nums.length;i++){
    //         ListNode listNode=new ListNode(nums[i]);
    //         tNode.next=listNode;
    //         tNode=tNode.next;
    //     }
    //     // while(hNode.next!=null){
    //     //     ListNode tNode2=hNode;

    //     // }
    //     // while(hNode.next!=null){
    //     //     System.out.println(hNode.next.val);
    //     //     hNode=hNode.next;
    //     // }
    //     return result;
    // }
    public static void main(String[] args) {
        // int[] nums=new int[100];
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=i;
        // }
        // deleteNumber(nums);
        
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int size=sc.nextInt();
                List<Integer> list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    list.add(i);
                }
                int j=0;
                while(list.size()>1){
                    j=(j+2)%list.size();
                    list.remove(j);
                }
                System.out.println(list.get(0));
            }
           sc.close();
        
    }
}