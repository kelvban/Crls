/**
 * serialize and deserialize binary tree
 */

 package nowcoder.sword;


 public class SerializeBinaryTree{
   int index=-1;
    String Serialize(TreeNode root) {
      if(root==null){
        return "#";
      }else{
        return root.val+","+Serialize(root.left)+","+Serialize(root.right);
      }
      
        
    }
      TreeNode Deserialize(String str) {
        String [] strings=str.split(",");
        index++;
        int len=strings.length;
        if(index>len){
          return null;
        }
        TreeNode treeNode=null;
        if(!strings[index].equals("#")){
          treeNode=new TreeNode(Integer.parseInt(strings[index]));
          treeNode.left=Deserialize(str);
          treeNode.right=Deserialize(str);
        }
        return treeNode;
         s
    }

 }