/**
 * sum of 1+2+3...+n
 */
package nowcoder.sword;
public class Sum {
    public int Sum_Solution(int n) {
        int result=n;
        boolean flag=(n>0)&&(result+=Sum_Solution(n-1))>0;
        return result;
    }
    public static void main(String[] args) {
        Sum sum=new Sum();
        int result=sum.Sum_Solution(3);
        System.out.println(result);
    }
}