

/**
 * Transforming binary search tree into bidirectional linked list
 */
package nowcoder.sword;
import java.util.*;



public class BinaryTreeTransformToLinkedList {
        public TreeNode Convert(TreeNode pRootOfTree) {
            if(pRootOfTree==null){
                return null;
            }
            ArrayList<TreeNode> list=new ArrayList<TreeNode>();
            Convert(pRootOfTree,list);
            return Convert(list);
        }
        
        //中序遍历，首先找到最左叶子节点，并添加入List中，再添加右叶子节点，递归，将中序遍历结果存入List
        //画图过一遍，自己就明白了,记住并没有return,中间那句代码始终执行。

        public void Convert(TreeNode pRootOfTree,ArrayList<TreeNode> list) {
            if(pRootOfTree.left!=null){
                Convert(pRootOfTree.left,list);
            }

            list.add(pRootOfTree);

            if(pRootOfTree.right!=null){
                Convert(pRootOfTree.right,list);
            }
        }

        //修改指针，左右子树指向分别改为前驱和后继
        public TreeNode Convert(ArrayList<TreeNode> list) {
            for(int i=0;i<list.size()-1;i++){
                list.get(i).right=list.get(i+1);
                list.get(i+1).left=list.get(i);
            }
            return list.get(0);
        } 
}