/**
 * find a path include the char in the matrix
 */
package nowcoder.sword;

public class FindAPathInMatrix {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int[] flag = new int[rows * cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (help(matrix, rows, cols, str, 0, flag, i, j))
                        return true;
                }
            }
            return false;
    }
    
    public boolean help(char[] matrix, int rows, int cols, char[] str, int cur, int[] flag, int r, int c) {
            //int row, int col表明当前的坐标的行列值
            //flag表明那些曾经在路径中出现过的节点的坐标
            //cur表示当前需要匹配的字符的位置，是下一个待访问的节点，不需关系其有效性，因为最后一个元素是‘、0’
            int index = cols * r + c;
            if (r >= 0 && r < rows && c >= 0 && c < cols && flag[index] == 0) {
                if (matrix[index] == str[cur]) {
                    cur = cur + 1;
                    if (cur >= str.length) return true;
                    flag[index] = 1;
                    if (help(matrix, rows, cols, str, cur, flag, r - 1, c) ||
                            help(matrix, rows, cols, str, cur, flag, r + 1, c) ||
                            help(matrix, rows, cols, str, cur, flag, r, c - 1) ||
                            help(matrix, rows, cols, str, cur, flag, r, c + 1))
                        return true;
                    flag[index] = 0;
                    return false;
//                }else{
//                    if(cur>0)return false;//我试图用这样的方法使得不用二次遍历，但是这样写是有bug的，代码会陷入死循环，除非我再写额外的控制，但那样代码就不简便了。
//                    else{
//                        if(help(matrix,rows, cols, str, cur, flag, r, c+1)||
//                                help(matrix,rows, cols, str, cur, flag, r+1, c)||
//                                help(matrix,rows, cols, str, cur, flag, r, c-1)||
//                                help(matrix,rows, cols, str, cur, flag, r+1, c))
//                            return true;
//                        else
//                            return false;
//                    }
//                }
                }
                return false;
            }
 
            return false;
        }

}