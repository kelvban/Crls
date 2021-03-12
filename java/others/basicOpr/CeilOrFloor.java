package others;

import java.util.Scanner;

public class CeilOrFloor {
    public static void main(String[] args){
        /*Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num=sc.nextLine();
            String[] strs=num.split("\\."); // Pay attention to escape characters
            int tail=Integer.parseInt(strs[strs.length-1]);
            double result=0;
            float n=Float.parseFloat(num);
            if(tail>=5){
                result=Math.ceil(n);
            }else{
                result=Math.floor(n);
            }
            System.out.print(result);
        }
        sc.close();*/
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num=sc.nextLine();
            int index=num.indexOf(".");
            int pre=Integer.parseInt(num.substring(0,index));
            int tail=Integer.parseInt(num.substring(index+1,index+2));
            if(tail<5){
                System.out.print(pre);
            }else{
                System.out.print(pre+1);
            }
        }
        sc.close();
    }
    
}