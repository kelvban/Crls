import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Broken line dividing plane
 */
public class BrokenLineDividingPlane{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            int num=Integer.parseInt(str);
            int[] linesArr=new int[500];
            linesArr[0]=1;
            for(int i=1;i<linesArr.length;i++){
                linesArr[i]=linesArr[i-1]+i;
            }
            System.out.println(linesArr[num*2]-num*2);
            
        }
        br.close();
    }
}