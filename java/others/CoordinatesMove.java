package others;

import java.util.Scanner;

public class CoordinatesMove {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x=0;
            int y=0;
            String str=sc.nextLine();
            String[] strs=str.split(";");
            for(int i=0;i<strs.length;i++){
                
                String preStr=strs[i].substring(0,1);
                String tailStr=strs[i].substring(1);
                if((preStr.equals("A")||preStr.equals("S")
                    ||preStr.equals("W")||preStr.equals("D"))
                   &&tailStr.matches("[0-9]*")){
                    int move=Integer.parseInt(tailStr);
                    switch(preStr){
                        case "A":
                            x=x-move;
                            break;
                        case "D":
                            x=x+move;
                            break;
                        case "S":
                            y=y-move;
                            break;
                        case "W":
                            y=y+move;
                            break;
                    }
                    
                }
            }
            StringBuffer sb=new StringBuffer();
            sb.append(x).append(",").append(y);
            System.out.println(sb.toString());
//             String filePath="./text.txt";
//             FileOutputStream f=new FileOutputStream(filePath);
//             f.write(sb.toString().getBytes());
//             f.close();
            }
        sc.close();
    }
}