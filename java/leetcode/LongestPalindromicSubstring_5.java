package leetcode;

public class LongestPalindromicSubstring_5 {
    /*public String longestPalindrome(String s) {
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
    }*/

    //dynamic planning
    public String longestPalindrome(String s) {
        // exception
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        // dp[i][j] marks that s[i, j] is a palindromic string or not  
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // As long as dp[i][j] == true holds， s[i..j] is a palindromic string，the length of the palindromic and the starting and ending position are recorded
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        String s="baaaab";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5=new LongestPalindromicSubstring_5();
        System.out.println(longestPalindromicSubstring_5.longestPalindrome(s.toString()));
    }
}