package others;

import java.util.*;

public class CharSet {

    public static String getCharSet(String s){
        char[] chars=s.toCharArray();
        Set<Object> set=new HashSet<>();
        for(int i=0;i<chars.length;i++){
            set.add(chars[i]);
        }
        StringBuffer stringBuffer=new StringBuffer();
        for(Object c:set){
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            String result=getCharSet(s);
            System.out.println(result);
        }
    }
}