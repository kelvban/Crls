package others;
import java.util.*;
public class StringSorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            int num=Integer.parseInt(str);
            Map<String,Integer> map=new TreeMap<>();
            for(int i=0;i<num;i++){
                String tempStr=sc.nextLine();
                if(!map.containsKey(tempStr)){
                    map.put(tempStr,1);
                }else{
                    map.put(tempStr,map.get(tempStr)+1);
                }
            }
            Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String,Integer> map1=iterator.next();
                if(map1.getValue()==1){
                    System.out.println(map1.getKey());
                }else{
                    for(int i=0;i<map1.getValue();i++){
                        System.out.println(map1.getKey());
                    }
                }
            }
        }
        sc.close();
    }
}