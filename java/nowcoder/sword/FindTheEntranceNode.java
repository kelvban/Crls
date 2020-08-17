
/**
 * find the EntraceNode of the list who has a circle
 */
import java.util.*;
class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

class FindTheEntranceNode{
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode node=pHead;
        Set<ListNode> set=new LinkedHashSet<ListNode>();
        while(node!=null){
            if(set.add(node)){
                node=node.next;
            }else{
                return node;
            }
        }
        return node;
    }
}