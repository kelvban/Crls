/**
 * judge the out-stack sequence
 */
package nowcoder.sword;
import java.util.*;
 class JudgeOutStackSequence{
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        Stack<Integer> stack=new Stack<Integer>();

        if(pushA.length!=popA.length){
            return false;
        }
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[j]){

                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
 }