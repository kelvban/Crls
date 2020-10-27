/**
 * reverse the sentance
 */
package nowcoder.sword;

import java.util.Stack;

public class ReverseSentance {
    public String ReverseSentence(String str) {
        String result="";
        if(str.length()<=0||str.trim().equals(""))
        return result;
        String [] strings=str.split(" ");
        Stack<String> stack=new Stack<String>();
        for(String s:strings){
            stack.push(s);
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
            if(stack.size()>0){
                result+=" ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str=" ";
        ReverseSentance reverseSentance=new ReverseSentance();
        String result=reverseSentance.ReverseSentence(str);
        System.out.println(result);
    }
}