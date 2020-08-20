/**
 * get the next node by LDR
 */
class TreeListNode{
    int val;
    TreeListNode left=null;
    TreeListNode right=null;
    //指向父节点
    TreeLinkNode next=null;
    TreeListNode(int val){
        this.val=val;
    }
}

class GetTreeNext{
    public TreeLinkNode GetNext(TreeLinkNode pNode)
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