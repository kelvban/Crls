/**
Find first Common node between two link list
 */
class ListNode{
    int  val；
    ListNode next=null;

    ListNode(int val){
        this.val=val;
    }
}
class FindFirstCommonNode{

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if(pHead1==null||pHead2==null){
            return null;
        }
        LinkedList<ListNode> stack1=new LinkedList<>();
        LinkedList<ListNode> stack2=new LinkedList<>();
        while(pHead1!=null){
            stack1.push(pHead1);
            pHead1=pHead1.next;
        }
        while(pHead2!=null){
            stack2.push(pHead2);
            pHead2=pHead2.next;
        }

        ListNode result=null;
        while(!stack1.isEmpty()&&!stack2.isEmpty()&&stack1.peek()==stack2.peek()){
            stack1.pop();
            result=stack2.pop();
        }
        return result;
    }
}