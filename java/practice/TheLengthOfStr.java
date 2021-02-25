package practice;

import java.util.Scanner;

public class TheLengthOfStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] strs=null;
        while(sc.hasNext()){
            String s=sc.nextLine();
            strs=s.split(" ");
            //int size=strs.length;
            // for(int i=0;i<strs.length;i++){
            //     System.out.println(strs[i]);
            // }
            System.out.println(strs[strs.length-1].length());
        }
        
    }
}