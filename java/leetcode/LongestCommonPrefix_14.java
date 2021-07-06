import java.util.*;
public class LongestCommonPrefix_14 {
	
    public String longestCommonPrefix(String[] strs){
    	Map<Character,Integer> map=new HashMap<>();
        for(String s:strs){
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(map.containsKey(c)){
                    int value=map.get(c)+1;
                    map.put(c,value);
                }else{
                    map.put(c,1);
                }
            }
        }
        String target=strs[0];
        for(String s:strs){
            if(s.length()<target.length()){
                target=s;
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<target.length();i++){
            char c=target.charAt(i);
            if(strs.length==map.get(c)){
                sb.append(c);
            }else{
                break;
            }
        }
        return sb.toString();
    }	    
}
