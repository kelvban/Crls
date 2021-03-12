package others;
import java.io.*;
public class FullNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine())!=null){
            System.out.println(conut2(Integer.valueOf(str)));
        }
    }
     
    public static int conut2(int n){
        if(n<6){
            return 0;
        } else if(n<28){
            return 1;
        }else if(n<496){
            return 2;
        } else if(n<8128){
            return 3;
        } else if(n<33550336){
            return 4;
        } else {
            return -1;
        }
    }
     
    public static int count(int n){
        int result = 0;
        for(int i =1;i<n;i++){
            int sum = 0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    sum += j;
                }
            }
            if(sum == i){
                result ++;
            }
        }
        return result;
    }
}