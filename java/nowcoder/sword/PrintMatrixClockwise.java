/**
 * Print matrix clockwise
 *
 */
package nowcoder.sword;

import java.util.ArrayList;

class PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return result;
        }
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(true){
            for(int col=left;col<=right;col++){
                result.add(matrix[up][col]);
            }
            up++;
            if(up>down){
                break;
            }
            for(int row=up;row<=down;row++){
                result.add(matrix[row][right]);
            }
            right--;
            if(left>right){
                break;
            }
            for(int col=right;col>=left;col--){
                result.add(matrix[down][col]);
            }
            down--;
            if(up>down){
                break;
            }
            for(int row=down;down>=up;down--){
                result.add(matrix[row][left]);
            }
            left++;
            if(left>right){
                break;
            }
        }
        return result;
    }
}