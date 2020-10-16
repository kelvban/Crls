/**
 * get the next node by LDR
 */
package nowcoder.sword;
class TreeListNode{
    int val;
    TreeListNode left=null;
    TreeListNode right=null;
    //指向父节点
    TreeListNode next=null;
    TreeListNode(int val){
        this.val=val;
    }
}

class GetTreeNext{
    public TreeListNode GetNext(TreeListNode pNode)
    {
        if(pNode.right!=null){
            pNode=pNode.right;
            while(pNode.left!=null){
               pNode=pNode.left;
            }
            return pNode;
        }
        while(pNode.next!=null&&pNode.next.right==pNode){
            pNode=pNode.next;
        }
        return pNode.next;
    }
}