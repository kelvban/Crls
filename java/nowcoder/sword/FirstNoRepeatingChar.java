/**
 * find first no repeating char
 */

package nowcoder.sword;

import java.util.*;



public class FirstNoRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int result=-1;
        if(str==null||str.equals("")){
            return result;
        }
        Map<Character,List<Integer>> map=new HashMap<Character,List<Integer>>();
        List<Integer> resultList=new ArrayList<Integer>();
        char [] chars=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(chars[i])){
                List<Integer> list=new ArrayList<Integer>();
                list.add(i);
                map.put(chars[i], list);
            }else{
                List<Integer> tempList=map.get(chars[i]);
                tempList.add(i);
                map.put(chars[i], tempList);
            }
            
        }
        Iterator<Map.Entry<Character,List<Integer>>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character,List<Integer>> entry=iterator.next();
            if(entry.getValue().size()==1){
                resultList.add(entry.getValue().get(0));
            }
        }
        resultList.sort(Comparator.naturalOrder());
        result=resultList.get(0);
        return result;
    }
    public static void main(String[] args) {
        String str="";
        FirstNoRepeatingChar firstNoRepeatingChar=new FirstNoRepeatingChar();
        int result= firstNoRepeatingChar.FirstNotRepeatingChar(str);
        System.out.println(result);
    }
}