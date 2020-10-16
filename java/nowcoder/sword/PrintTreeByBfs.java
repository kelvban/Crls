/**
 * print tree node layer by layer 
 */
package nowcoder.sword;

import java.util.ArrayList;
import java.util.LinkedList;

class PrintTreeByBfs{

    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>> ();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();

        if(pRoot==null){
            return result;
        }
        queue.offer(pRoot);

        while(!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<Integer>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node.val);

                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}