/**
 * Merging two monotonically increasing linked list
 */

import java.util.Random;
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

class MergeTwoList{

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head=new ListNode(-1);
        head.next=null;
        ListNode root=head;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                head.next=list1;
                head=list1;
                list1=list1.next;
            }else{
                head.next=list2;
                head=list2;
                list2=list2.next;
            }
        }
        if(list1!=null){
            head.next=list1;
        }
        if(list2!=null){
            head.next=list2;
        }
        return root.next;
    }
    // public static void main(String[] args) {
    //     ListNode list1=new ListNode(1);
    //     ListNode head1=list1;
    //     ListNode list2=new ListNode(2);
    //     ListNode head2=list2;
    //     Random random=new Random();
    //     for(int i=0;i<4;i++){
    //         ListNode n1=new ListNode(random.nextInt(5));
    //         head1.next=n1;
    //         head1=n1;
    //         ListNode n2=new ListNode(random.nextInt(5));
    //         head2.next=n2;
    //         head2=n2;
    //     }

    //     while(list1!=null){
    //         System.out.println(list1.val);
    //         list1=list1.next;
    //     }
    //}
}