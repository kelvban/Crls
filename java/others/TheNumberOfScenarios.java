package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNumberOfScenarios {
    // public static void main(String[] args)throws IOException {
    //     BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    //     String line = null;
    //     while ((line = bReader.readLine()) != null) {
    //            int n=Integer.valueOf(line.substring(0,line.indexOf(" ")));
    //         int m=Integer.valueOf(line.substring(line.indexOf(" ")+1));
    //         System.out.println(getCount(n, m));
    //     }
    // }
  
 
    // public static int getCount(int n,int m) {
    //     int[][] dp=new int[n+1][m+1];
    //     for(int i=0;i<n+1;i++) {
    //         for(int j=0;j<m+1;j++) {
    //             if(i==0||j==0){
    //                 // 边上的每一个点的可能性都是1，因为走到边上，就只能顺着边往下走了，可能性只能是1
    //                 dp[i][j]=1;
    //             }else{
    //                 // 往后每一个点，都是后面两个点的可能性之和，因为它可以选择任意一个点来走，可能性就是下两个点的可能性相加
    //                 dp[i][j]=dp[i][j-1]+dp[i-1][j];
    //             }
    //         }
    //     }
    //     // 最终加到最后一个点，可能性就是所有的路线数量
    //     return dp[n][m];
    // }
    public static void main(String[] args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            String[] strs=str.split(" ");
            int n=Integer.parseInt(strs[0]);
            int m=Integer.parseInt(strs[1]);
            int[][] dp=new int[n+1][m+1];
            for(int i=0;i<n+1;i++){
                for(int j=0;j<m+1;j++){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=dp[i][j-1]+dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
        br.close();
    }
}