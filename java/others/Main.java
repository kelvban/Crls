// import java.io.*;
// public class Main{
//     public static void main(String[] args) throws Exception{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String str=null;
//         while((str=br.readLine())!=null){
//             int max=Integer.parseInt(str);
//             int num=Integer.parseInt(br.readLine());
//             String m=br.readLine();
//             String[] strs=m.split(" ");
//             int[] arr=new int[num];
//             int result=0;
//             int temp=0;
//             for(int i=0;i<num;i++){
//                 arr[i]=Integer.parseInt(strs[i]);
//             }
//             for(int j=0;j<num;j++){
//                 arr[j]=arr[j]+temp;
//                 if(arr[j]<=max){
//                     result++;
//                     temp=0;
//                 }else{
//                     result++;
//                     temp=arr[j]-max;
//                 }
//             }
//             while(temp>0){
//                 result++;
//                 temp=temp-max;
//             }
//             System.out.println(result);
//         }
//         br.close();
//     }
// }


// import java.io.*;
// public class Main{
//     public static void main(String[] args) throws Exception{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String str=null;
//         while((str=br.readLine())!=null){
//             int num=Integer.parseInt(str);
//             String str1=br.readLine();
//             String[] strs=str1.split("-");
//             String pre=strs[0];
//             StringBuffer sb=new StringBuffer();
//             for(int i=1;i<strs.length;i++){
//                 sb.append(strs[i]);
//             }
//             String target=sb.toString();
//             StringBuffer sb1=new StringBuffer();
//             while(target.length()>=num){
//                 String result=target.substring(0,num);
//                 String convertStr=isUpper(result);
//                 sb1.append(convertStr).append("-");
//                 target=target.substring(num);
//             }
//             String last=isUpper(target);
//             if(sb1.toString().isEmpty()&&last.isEmpty()){
//                 System.out.println(pre);
//             }else if(!sb1.toString().isEmpty()&&last.isEmpty()){
//                 String temp=pre+"-"+sb1.toString()+last;
//                 System.out.println(temp.substring(0,temp.length()-1));
//             }
//             else{
//                 System.out.println(pre+"-"+sb1.toString()+last);
//             }
            
//         }
//         br.close();
//     }
//     public static String isUpper(String str){
//         int upper=0,lower=0;
//         char[] chars=str.toCharArray();
//         for(int i=0;i<chars.length;i++){
//             if('A'<=chars[i]&&chars[i]<='Z'){
//                 upper++;
//             }else if('a'<=chars[i]&&chars[i]<='z'){
//                 lower++;
//             }else{
//                 continue;
//             }
//         }
//         if(upper>lower){
//             str=str.toUpperCase();
//         }else if(upper<lower){
//             str=str.toLowerCase();
//         }
//         return str;
//     }
// }

import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=br.readLine())!=null){
            String[] strs=str.split(",");
            int customer=Integer.parseInt(strs[0]);
            int shop=Integer.parseInt(strs[1]);
            Map<Integer,Integer> mostVoteMap=new HashMap<>();
            Map<Integer,Map<Integer,Integer>> voteInfo=new HashMap<>();
            int[] arr=new int[customer];
            for(int i=0;i<customer;i++){
                String vote=br.readLine();
                String[] voteStrs=vote.split(",");
                if(!mostVoteMap.containsKey(Integer.parseInt(voteStrs[0]))){
                    mostVoteMap.put(Integer.parseInt(voteStrs[0]), 1);
                }else{
                    mostVoteMap.put(Integer.parseInt(voteStrs[0]), mostVoteMap.get(Integer.parseInt(voteStrs[0])));
                }
                HashMap<Integer,Integer> tempMap=new HashMap<>();
                tempMap.put(Integer.parseInt(voteStrs[0]), Integer.parseInt(voteStrs[1]));
                voteInfo.put(i, tempMap);
                arr[i]=Integer.parseInt(voteStrs[0]);
            }
            int maxVotedShop=0;
            int maxVotedNumber=0;
            for(Integer i:mostVoteMap.keySet()){
                if(mostVoteMap.get(i)>maxVotedNumber){
                    maxVotedNumber=mostVoteMap.get(i);
                    maxVotedShop=i;
                }
            }
            maxVotedNumber=mostVoteMap.get(maxVotedShop);
            if(maxVotedShop==1){
                System.out.println(0);
            }else{
                int voteOne=mostVoteMap.get(1);
                int result=0;
                //int minCost=0;
                while(voteOne<=maxVotedNumber){
                    int minCost=0;
                    for(Integer i:voteInfo.keySet()){
                        Map<Integer,Integer> map=new HashMap<>();
                        map=voteInfo.get(i);
                        map.get(i);
                    }
                }
            }

        }
        br.close();
    }
}