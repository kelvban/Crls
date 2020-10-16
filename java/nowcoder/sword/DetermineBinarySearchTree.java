/**
 * Determine whether the array satisfies the post order traversal of binary search tree
 */
package nowcoder.sword;


 public class DetermineBinarySearchTree{

        public boolean VerifySquenceOfBST(int [] sequence) {
            if(sequence==null||sequence.length==0){
                return false;
            }
            return VerifyTree(sequence,0,sequence.length-1);
        }

        public boolean VerifyTree(int [] sequence,int head,int root){
            if(head>=root){
                return true;
            }

            int key=sequence[root];
            int i; //标识分界点
            //找到左右子树分界点
            for(i=head;i<root;i++){
                if(sequence[i]>key){
                    break;
                }
            }
            for(int j=i;j<root;j++){
                if(sequence[j]<key){
                    return false;
                }
            }
            return VerifyTree(sequence,head,i-1)&&VerifyTree(sequence,i,root-1);
        }
    }
