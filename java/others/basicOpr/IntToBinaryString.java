package others;

import java.util.Scanner;

public class IntToBinaryString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            String str=Integer.toBinaryString(num);
            char[] chars=str.toCharArray();
            int count=0;
            for(char c:chars){
                if(c=='1'){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}