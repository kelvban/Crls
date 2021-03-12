package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class good {
    int v;
    int p;
    int q;
    int a1=0;
    int a2=0;
    good(int v,int p,int q){
        this.v=v;
        this.p=p;
        this.q=q;
    }
    public void setV(int v){
        this.v=v;
    }
    public void setA1(int a1){
        this.a1=a1;
    }
    public void setA2(int a2){
        this.a2=a2;
    }
}
public class ShoppingList {
    public static int dw=100;//加快运行
     
    public static void main(String[] args) throws IOException{
        boolean flag=true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        
        int N = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        good[] A = new good[m+1];
        for(int i =1;i<=m;i++){
            strArr = br.readLine().split(" ");
            int v = Integer.parseInt(strArr[0]);  
            int p = Integer.parseInt(strArr[1]);
            int q = Integer.parseInt(strArr[2]);
            if(flag){
                if(v%dw!=0){
                   flag=false;
                   dw=10;
                   for(int j=1;j<i;j++)
                       A[j].setV(A[j].v*10);
                }
            }
            v=v/dw;
            A[i]=new good(v,p,q);
            if(q>0){
                if(A[q].a1==0){
                    A[q].setA1(i);
                }else{
                    A[q].setA2(i);
                }
            }
        }
        N=N/dw;
        dp(N,A);
    }
     
    public static void dp(int N,good[] A){
        int[][] dp = new int[N+1][A.length];
        for(int i=1;i<A.length;i++){
            int v=-1,v1=-1,v2=-1,v3=-1,tempdp=-1,tempdp1=-1,tempdp2=-1,tempdp3=-1;
            v=A[i].v;
            tempdp=v*A[i].p;
            if(A[i].a1!=0&&A[i].a2!=0){
                v3=v+A[A[i].a1].v+A[A[i].a2].v;
                tempdp3=tempdp+A[A[i].a1].v*A[A[i].a1].p+A[A[i].a2].v*A[A[i].a2].p;
            }
            if(A[i].a1!=0){
                v1 = v + A[A[i].a1].v;
                tempdp1=tempdp+A[A[i].a1].v*A[A[i].a1].p;
            }
            if(A[i].a2!=0){
                v2 = v + A[A[i].a2].v;
                tempdp2=tempdp+A[A[i].a2].v*A[A[i].a2].p;
            }
            for(int j=1;j<N+1;j++){
                if(A[i].q>0){
                    dp[j][i]=dp[j][i-1];
                }else{
                    dp[j][i]=dp[j][i-1];
                    if(j>=v&&v!=-1) dp[j][i] = Math.max(dp[j][i],dp[j-v][i-1]+tempdp);
                    if(j>=v1&&v1!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v1][i-1]+tempdp1);
                    if(j>=v2&&v2!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v2][i-1]+tempdp2);
                    if(j>=v3&&v3!=-1) dp[j][i]=Math.max(dp[j][i],dp[j-v3][i-1]+tempdp3);
                }
            }
  
        }
        System.out.println(dp[N][A.length-1]*dw);
    }
}