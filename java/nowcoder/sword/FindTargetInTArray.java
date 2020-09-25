/**
 * Find the number of targets in a two-dimensional array
 *
 */

 class FindTargetInTArray{
    public boolean Find(int target, int [][] array) {
        // for(int i=0;i<array.length;i++){
        //     for(int j=0;j<array[0].length;j++){
        //         if(array[i][j]==target)
        //         return true;
        //     }
        // }
        // return false;
        int rows = array.length;
        if(rows == 0){
            return false;
        }
        int cols = array[0].length;
        if(cols == 0){
            return false;
        }
        // 左下
        int row = rows-1;
        int col = 0;
        while(row>=0 && col<cols){
            if(array[row][col] < target){
                col++;
            }else if(array[row][col] > target){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }
 }