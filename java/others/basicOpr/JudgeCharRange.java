package others;

import java.util.*;

public class JudgeCharRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] chars=str.toCharArray();
            Set<Character> set=new HashSet<>();
            for(Character c:chars){
                set.add(c);
            }
            int count=0;
            for(Character c:set){
                int temp=(int)c;
                if((temp>=0&&temp<=127)){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}