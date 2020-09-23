/**
 * Transforming binary search tree into bidirectional linked list
 */

class BinaryTreeTransformToLinkedList{
        //用于储存中序遍历当前的节点，作为中间变量，将双向指针链接起来
        private TreeNode pre=null;
        //递归到最深层，返回双向链表的头
        private TreeNode head=null;
        public TreeNode Convert(TreeNode pRootOfTree) {
            //这种中序遍历每次返回一个节点过于麻烦，所以定义一个函数每次返回为空
            inOrder(pRootOfTree);
            return head;
        }
        private void inOrder(TreeNode node)
        {
            //遍历到最深处节点为空进行返回
            if(node==null)
            {
                return;
            }
            //左递归
            inOrder(node.left);
            //中序遍历在中间进行处理
            //利用pre将彼此互相指向
            node.left=pre;
            if(pre!=null)
            {
                pre.right=node;
            }
            //pre移位
            pre=node;
            //递归到最深处才将头赋值，也就是双向链表的头
            if(head==null)
            {
                head=node;
            }
            //右递归
            inOrder(node.right);
        }
}