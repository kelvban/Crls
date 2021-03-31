import java.io.BufferedReader;
import java.io.InputStreamReader;



public class ALittleBee {
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            int num=Integer.parseInt(str);
            for(int i=0;i<num;i++){
                String flagPositionStr=br.readLine();
                String[] strs=flagPositionStr.split(" ");
                int startPosition=Integer.parseInt(strs[0]);
                int endPosition=Integer.parseInt(strs[1]);
                int[] arr=new int[50];
                int sequence=startPosition-endPosition;
                if(sequence==1||sequence==2){
                    System.out.println(sequence);
                }else{
                    arr[0]=0;
                    arr[1]=1;
                    arr[2]=2;
                    for(int j=3;j<50;j++){
                        arr[j]=arr[j-1]+arr[j-2];
                    }
                }
                System.out.println(arr[endPosition-startPosition]);
            }
            
        }
        br.close();
    }
}