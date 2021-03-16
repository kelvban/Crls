import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * There is a staircase with m steps. 
 * At the beginning, you are in the first step. 
 * If you can only step up one or two steps at a time, 
 * how many ways do you have to go to the M step
 */
public class SuperStair {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while((br.readLine())!=null){
            int[] arr=new arr[55];
            int num=Integer.parseInt(str);
            if(num<=3){
                System.out.println(num-1);
            }
            arr[2]=1;
            arr[3]=2;
            for(int i=4;i<55;i++){
                arr[i]=arr[i-1]+arr[i+1];
            }
            System.out.println(arr[num]);
        }
    }
}