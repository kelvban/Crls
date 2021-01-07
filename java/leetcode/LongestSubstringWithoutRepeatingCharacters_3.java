package leetcode;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        int result=0,l=0,r=0;
        HashSet<Character> hashSet=new HashSet<>();
        while(r<s.length()){
            if(!hashSet.contains(s.charAt(r))){
                hashSet.add(s.charAt(r++));
                result=Math.max(result, hashSet.size());
            }else{
                hashSet.remove(s.charAt(l++));
            }
        }
        return result;
    }
}