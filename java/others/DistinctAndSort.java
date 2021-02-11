package others;
import java.util.*;

import sun.reflect.generics.tree.Tree;
public class DistinctAndSort {
    // public static void distinctAndSort(List<Integer> nums){
    //     Map<Integer,Integer> map=new HashMap<>();
    //     List<Integer> list=new LinkedList<>();
    //     for(int i=0;i<nums.size();i++){
    //         if(!map.containsKey(nums.get(i))){
    //             map.put(nums.get(i),nums.get(i));
    //         }
    //     }
    //     for(Integer key:map.keySet()){
    //         list.add(map.get(key));
    //     }
    //     Collections.sort(list);
    //     for (Integer integer : list) {
    //         System.out.println(integer);
    //     }
    // }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            TreeSet<Integer> set=new TreeSet<>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer integer:set){
                System.out.println(integer);
            }
        }
    }
}