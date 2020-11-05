/**
 * print binary tree following Z
 */
package nowcoder.sword;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintBinaryTree {
    public class Solution {
        public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
            LinkedList<TreeNode> q = new LinkedList<>();
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            boolean rev = true;
            q.add(pRoot);
            while(!q.isEmpty()){
                int size = q.size();
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=0; i<size; i++){
                    TreeNode node = q.poll();
                    if(node == null){continue;}
                    if(rev){
                        list.add(node.val);
                    }else{
                        list.add(0, node.val);
                    }
                    q.offer(node.left);
                    q.offer(node.right);
                }
                if(list.size()!=0){res.add(list);}
                rev=!rev;
            }
            return res;
        }
    
    }
}