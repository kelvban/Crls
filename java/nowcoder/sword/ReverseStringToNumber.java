/**
 * Reversse String to Integer
 */

package nowcoder.sword;

public class ReverseStringToNumber {
    public int StrToInt(String str) {
        if(!str.matches("[+,-]?\\d+")) return 0;
        int len = str.length();
        int i = len-1;
        long res = 0;  //long类型，避免溢出。不能用int
 
        while(i>=0&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
            res += Math.pow(10,len-1-i)*(str.charAt(i)-'0');
            i--;
        }
        res = (str.charAt(0) == '-' ? -res : res);
        //溢出就返回0，用long类型的res来比较，
        //如果定义为int res,那再比较就没有意义了，int范围为[-2147483648,2147483647]
        if(res>Integer.MAX_VALUE|| res<Integer.MIN_VALUE)return 0;
        return (int)res;
    }
}