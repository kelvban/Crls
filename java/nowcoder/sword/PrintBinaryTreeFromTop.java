/**
 * print binary tree from top to bottom
 */

package nowcoder.sword;
import java.util.*;
public class PrintBinaryTreeFromTop {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
 
        if(root == null)
            return res;
 
        deque.add(root);
 
        while(!deque.isEmpty()){
            TreeNode node = deque.getFirst();
            deque.pollFirst();
            res.add(node.val);
 
            if(node.left != null)
                deque.addLast(node.left);
 
            if(node.right != null)
                deque.addLast(node.right);
        }
 
        return res;
    }
}