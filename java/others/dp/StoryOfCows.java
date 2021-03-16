package others.storyOfCows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StoryOfCows {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while((str=br.readLine())!=null){
            int year=Integer.parseInt(str);
            int result=cows(year);
            System.out.println(result);
        }
        br.close();
    }
   public static int cows(int year){
       if(year<4){
           return year;
       }else{
           return cows(year-1)+cows(year-3);
       }
   }

//    public static void main(String[] args) throws Exception{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String str="";
//         while((str=br.readLine())!=null){
//             int year=Integer.parseInt(str);
//             //int result=cows(year);
//             int[] result=new int[60];
//             for(int j=0;j<4;j++){
//                 result[j]=j+1;
//             }
//             for(int i=4;i<55;i++){
//                 result[i]=result[i-1]+result[i-3];
//             }
//             System.out.println(result[year-1]);
//         }
//         br.close();
//     }
}