package leetcode;

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
}