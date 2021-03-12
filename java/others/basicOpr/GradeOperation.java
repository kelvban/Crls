package others;

import java.util.Scanner;

public class GradeOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String firstLine=sc.nextLine();
            String[] flStrs=firstLine.split(" ");
            int stuNumber=Integer.parseInt(flStrs[0]);
            int oprNumber=Integer.parseInt(flStrs[1]);
            // System.out.println(stuNumber);
            // System.out.println(oprNumber);
            String secondLine=sc.nextLine();
            String[] slStrs=secondLine.split(" ");
            int[] stu=new int[stuNumber];
            for(int i=0;i<stuNumber;i++){
                stu[i]=Integer.parseInt(slStrs[i]);
            }
            for(int j=0;j<oprNumber;j++){
                String opr=sc.nextLine();
                String[] oprStrs=opr.split(" ");
                switch(oprStrs[0]){
                    case "Q":
                    int pos1=Integer.parseInt(oprStrs[1])-1;
                    int pos2=Integer.parseInt(oprStrs[2])-1;
                    select(stu,pos1,pos2);
                    case "U":
                    int pos=Integer.parseInt(oprStrs[1])-1;
                    int grade=Integer.parseInt(oprStrs[2]);
                    stu[pos]=grade;
                }
            }
        }
    }

    private static void select(int[] stu,int pos1, int pos2) {
        int max=-1;
        for(int i=pos1;i<=pos2;i++){
            if(stu[i]>=max){
                max=stu[i];
            }
        }
        System.out.println(max);
    }
}