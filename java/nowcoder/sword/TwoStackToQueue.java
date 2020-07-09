/**
 * use two stacks to implement a queue
 */

import java.util.Stack;
class TwoStackToQueue{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        if(stack2.size()==0){
            while(!stack1.empty()){
                int temp=stack1.peek();
                stack2.push(temp);
                stack1.pop();
            }
        }
        int result=stack2.peek();
        stack2.pop();
        return result;
    }
    /* public static void main(String[] args) {
        TwoStackToQueue toQueue=new TwoStackToQueue();
        for(int i=1;i<=5;i++){
            toQueue.push(i);
        }
        for(int i=0;i<5;i++){
            System.out.println(toQueue.pop());
        }
    } */
}