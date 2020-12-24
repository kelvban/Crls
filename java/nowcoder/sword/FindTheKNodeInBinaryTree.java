package nowcoder.sword;

import java.util.ArrayList;

public class FindTheKNodeInBinaryTree {
    ArrayList<TreeNode> list = new ArrayList<>(); // (1)
 
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        addNode(pRoot);
 
        if(k>=1 && list.size()>=k) {
            return list.get(k-1);
        }
 
        return null;
 
    }
 
    // 中序遍历
    void addNode(TreeNode cur) {   // (2)
        if(cur != null) {
            addNode(cur.left);
            list.add(cur);
            addNode(cur.right);
        }
    }
}