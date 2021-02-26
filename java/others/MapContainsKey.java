package others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapContainsKey {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        Map<String,String> map=new HashMap<>();
        map.put("reset","reset what");
        map.put("reset board","board fault");
        map.put("board add","where to add");
        map.put("board delete","no board at all");
        map.put("reboot backplane","impossible");
        map.put("backplane abort","install first");
        while((str=br.readLine())!=null){
            if(map.containsKey(str)){
                System.out.println(map.get(str));
            }else{
                System.out.println("unknown command");
            }
        }
        br.close();
    }
}