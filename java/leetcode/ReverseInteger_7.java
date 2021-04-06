import java.util.Stack;
import java.util.regex.Pattern;

public class ReverseInteger_7 {

    public int reverse(int x) {
        String pattern="[0-9]";
        int result=0;
        String xStr=String.valueOf(x);
        char[] xChars=xStr.toCharArray();
        Stack<Character> stack =new Stack<>();
        if(Pattern.matches(pattern, String.valueOf(xChars[0]))){
            for(Character c:xChars){
                stack.push(c);
            }
        }else{
            for(int i=1;i<xChars.length;i++){
                stack.push(xChars[i]);
            }
        }
        StringBuffer sb=new StringBuffer();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        if(Pattern.matches(pattern, String.valueOf(xChars[0]))){
            result=Integer.parseInt(sb.toString());
        }else{
            result=Integer.parseInt(String.valueOf(xChars[0])+sb.toString());
        }
        return result;
    }
    public static void main(String[] args) {
        int x=-108;
        ReverseInteger_7 reverseInteger_7=new ReverseInteger_7();
        int result=reverseInteger_7.reverse(x);
        System.out.println(result);
    }

}