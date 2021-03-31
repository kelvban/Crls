
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import javafx.scene.Cursor;

class ListNode{
    int val;
    ListNode next;
    public ListNode(){};
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}

public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            if(l1.val>=10){
                l2=new ListNode(0);
                l2.next=null;
            }else{
                return l1;
            }
        }
        int sum=l1.val+l2.val;
        l1.val=sum%10;
        if(sum>=10){
            if(l1.next==null){
                l1.next=new ListNode(1);
            }else{
                l1.next.val++;
            }
        }
        l1.next=addTwoNumbers(l1.next,l2.next);
        return l1;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String str1=br.readLine();
        ListNode head=new ListNode();
        ListNode head1=new ListNode();
        if((str==null||str.isEmpty())&&(str1==null||str1.isEmpty())){
            return ;
        }
        if((str!=null||!str.isEmpty())&&(str1==null||str1.isEmpty())){
            String[] strs=str.split(" ");
            int[] nums=new int[strs.length];
            ListNode cursor=new ListNode();
            for(int i=0;i<strs.length;i++){
                nums[i]=Integer.parseInt(strs[i]);
                ListNode lNode=new ListNode(nums[i]);
                if(head.val==0){ //The first interpolation
                    head=cursor=lNode;
                }else{
                    cursor.next=lNode;
                    cursor=lNode;
                }

                // if(head.val==0){ //The tail interpolation
                //     head=lNode;
                // }else{
                //     lNode.next=head;
                //     head=lNode;

                // }
            }
            while(head!=null){
                System.out.println(head.val);
                head=head.next;
            }
        }
        br.close();
    }
}