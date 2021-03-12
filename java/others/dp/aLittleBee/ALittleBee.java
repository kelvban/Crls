import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ALittleBee {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            int num=Integer.parseInt(str);
            for(int i=0;i<num;i++){
                String flagPositionStr=br.readLine();
                String[] strs=flagPositionStr.split(" ");
                int startPosition=Integer.parseInt(strs[0]);
                int endPosition=Integer.parseInt(strs[1]);

            }
        }
        br.close();
    }
    public static int getResult(int sequence){
        
    }
}