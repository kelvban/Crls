package others;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            int result=jumpF(num);
            int result1=jumpF1(num);
            System.out.println(result+" "+result1);
        }
    }
    public static int jumpF(int n){
        
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return n;
        }
        return jumpF(n-1)+jumpF(n-2);
    }

    public static int jumpF1(int n){
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return n;
        }
        int result=0;
        int one=1,two=2;       
        for(int i=3;i<=n;i++){
            result=one+two;
            one=two;
            two=result;
        }
        return result;
    }
}