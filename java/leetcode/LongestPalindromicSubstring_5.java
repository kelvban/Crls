package leetcode;

public class LongestPalindromicSubstring_5 {
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int begin=0;
        int maxLen=1;
        char [] chars=s.toCharArray();
        //Enumerx all substrules longer than 1
        for (int i = 0; i < s.length()- 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i + 1 > maxLen && validPalindromic(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    //palindromicSubstring check
    public boolean validPalindromic(char [] chars,int left,int right){
        while(left<right){
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="baaaab";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5=new LongestPalindromicSubstring_5();
        System.out.println(longestPalindromicSubstring_5.longestPalindrome(s.toString()));
    }
}