package leetcode;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion_6 {

    public String convert(String s, int numRows) {
        // if(s.length()<2||numRows<2){
        //     return s;
        // }
        // char [] chars=s.toCharArray();
        // //The number of columns is calculated from the iso-difference column
        // int numCols= (int) Math.ceil((chars.length / (3 * numRows - 2))*numRows);
        // char [][] zigzag=new char[numRows][numCols];   //up(col）=len/(3n-2)

        // int i=0,j=0;
        // int pos=0;

        // while(pos<chars.length){
        //     if(i==0){
        //         for(i=0;i<numRows;i++){
        //             zigzag[i][j]=chars[pos];
        //             pos++;
        //             if(pos>chars.length){
        //                 break;
        //             }
        //         }
        //     }
        //     if(i==numRows-1){
        //         for(i=numRows-1;i>-1;i--){
        //             j++;
        //             zigzag[i][j]=chars[pos];
        //             pos++;
        //             if(pos>chars.length){
        //                 break;
        //             }
        //         }
        //     }
            
        // }
        // String result="";
        // for(int m=0;m<numRows;m++){
        //     for(int n=0;n<numCols;n++){
        //         result+=String.valueOf(zigzag[m][n]);
        //     }
        // }
        // return result;



        if(numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for(char c : s.toCharArray()) {
            rows.get(i).append(c);
            if(i == 0 || i == numRows -1) 
            flag = - flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();

    }

    

}