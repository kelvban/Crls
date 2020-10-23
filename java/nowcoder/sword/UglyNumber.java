
/**
 * get the ugly number
 */
package nowcoder.sword;

public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        //1x(2,3,5)=2,3,5 2x(2.3.5)=4,6,10 3x(2,3,5)=6,9,15......
        if(index <= 0)return 0;
        int p2=0,p3=0,p5=0;//初始化三个指向三个潜在成为最小丑数的位置
        int[] result = new int[index];
        result[0] = 1;//
        for(int i=1; i < index; i++){
            result[i] = Math.min(result[p2]*2, Math.min(result[p3]*3, result[p5]*5));
            if(result[i] == result[p2]*2)
            p2++;//为了防止重复需要三个if都能够走到
            if(result[i] == result[p3]*3)
            p3++;//为了防止重复需要三个if都能够走到
            if(result[i] == result[p5]*5)
            p5++;//为了防止重复需要三个if都能够走到
        }
        return result[index-1];
    }
}