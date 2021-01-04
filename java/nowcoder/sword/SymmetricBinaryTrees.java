/**
 * Symmetric binary trees
 */
package nowcoder.sword;

public class SymmetricBinaryTrees {
    public boolean jude(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        }
 
        if (node1.val != node2.val) {
            return false;
        } else {
            return jude(node1.left, node2.right) && jude(node1.right, node2.left);
        }
    }
 
    public boolean isSymmetrical(TreeNode pRoot) {
        return pRoot==null || jude(pRoot.left, pRoot.right);
    }
}