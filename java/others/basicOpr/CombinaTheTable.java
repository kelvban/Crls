package others;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class CombinaTheTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String num1=sc.nextLine();
            int num=Integer.parseInt(num1);
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<num;i++){
                String str=sc.nextLine();
                // if(str.equals("")||str==null){
                //     return ;
                // }
                String[] strs=str.split(" ");
                int key=Integer.parseInt(strs[0]);
                int value=Integer.parseInt(strs[1]);
                if(!map.containsKey(key)){
                    map.put(key,value);
                }else{
                    map.put(key,map.get(key)+value);
                }
            }
            TreeSet<Integer> set=new TreeSet();
            for(Integer i:map.keySet()){
                set.add(i);
            }
            for(Integer j:set){
                StringBuffer sb=new StringBuffer();
                sb.append(j).append(" ").append(map.get(j));
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}