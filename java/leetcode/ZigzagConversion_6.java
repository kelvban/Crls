package leetcode;

public class ZigzagConversion_6 {

    public String convert(String s, int numRows) {
        if(s.length()<2||numRows<2){
            return s;
        }
        char [] chars=s.toCharArray();
        //The number of columns is calculated from the iso-difference column
        int numCols= (int) Math.ceil((chars.length / (3 * numRows - 2))*numRows);
        char [][] zigzag=new char[numRows][numCols];   //up(col）=len/(3n-2)

        return s;
    }

}