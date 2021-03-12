package others;

import java.util.Scanner;

public class Decode {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num=sc.next();
            System.out.println(Integer.decode(num));
        }
        sc.close();
    }
}