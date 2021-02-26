package others;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            
            char[] chars=str.toCharArray();
            int count=0;
            for(int i=0;i<chars.length;i++){
                if(Character.isUpperCase(chars[i])){
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}