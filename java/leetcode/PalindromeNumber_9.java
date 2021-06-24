import java.util.Stack;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {

        if(x>Integer.MAX_VALUE||x<0){
            return false;
        }
        String target=String.valueOf(x);
        char[] chars=target.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            stack.add(c);
        }
        StringBuffer stringBuffer=new StringBuffer();
        while(!stack.isEmpty()){
            stringBuffer.append(stack.pop());
        }
        double result=Double.parseDouble(stringBuffer.toString());
        if(result==x){
            return true;
        }
        return false;
        
    }
}