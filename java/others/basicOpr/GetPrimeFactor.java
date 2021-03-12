package others;
import java.util.*;
public class GetPrimeFactor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long num=sc.nextLong();
            StringBuffer sb=new StringBuffer();
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    sb.append(i).append(" ");
                    num=num/i;
                    i--;
                }
            }
            sb.append(num).append(" "); //do not lost the last prime factor
            System.out.print(sb.toString());
        }
        sc.close();
    }
}