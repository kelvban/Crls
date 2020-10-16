/**
 * sub-string rotate left
 */
package nowcoder.sword;
 import java.util.*;

class RotateLeft{
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len==0) return "";
        n = n%len;
        str += str;
        len=len+n;
        return str.substring(n,len);
    }
 }