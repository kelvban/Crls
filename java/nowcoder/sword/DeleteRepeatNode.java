
/**
 * delete repeat node in the list
 */
package nowcoder.sword;


import java.util.HashSet;


public class DeleteRepeatNode {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null){
            return  null;
        }
        // 先找出相同结点，存入 set
        HashSet<Integer> set = new HashSet<>();
        ListNode pre = pHead;
        ListNode cur = pHead.next;
        while(cur != null){
            if(cur.val == pre.val){
                set.add(cur.val);
            }
            pre = cur;
            cur = cur.next;
        }
        // 再根据相同节点删除
        // 先删头部
        while(pHead != null && set.contains(pHead.val)){
            pHead = pHead.next;
        }
        if(pHead == null){
            return null;
        }
        // 再删中间结点
        pre = pHead;
        cur = pHead.next;
        while(cur != null){
            if(set.contains(cur.val)){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return pHead;
    }
}