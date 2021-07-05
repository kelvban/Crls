import java.util.*;
class RomanToInteger_13{
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result=0;
        int length=s.length();
        for(int i=0;i<length;++i){
            int value=map.get(s.charAt(i));
            if(i<length-1&&value<map.get(s.charAt(i+1))){
                result-=value;
            }else{
                result+=value;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s=args[0];
        int result = RomanToInteger_13.romanToInt(s);
        System.out.println(result);
    }
}