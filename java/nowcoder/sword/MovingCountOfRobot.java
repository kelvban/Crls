/**
 * get max count of the robot where it could be
 */


package nowcoder.sword;

public class MovingCountOfRobot {

    public int movingCount(int threshold, int rows, int cols) {
        if (rows <= 0 || cols <= 0 || threshold < 0)
            return 0;
 
        boolean[][] isVisited = new boolean[rows][cols];//标记
        int count = movingCountCore(threshold, rows, cols, 0, 0, isVisited);
        return count;
    }
 
    private int movingCountCore(int threshold,int rows,int cols,int row,int col, boolean[][] isVisited) {
        if (row < 0 || col < 0 || row >= rows || col >= cols || isVisited[row][col]
                || cal(row) + cal(col) > threshold)
            return 0;
        isVisited[row][col] = true;
        return 1 + movingCountCore(threshold, rows, cols, row - 1, col, isVisited)
                + movingCountCore(threshold, rows, cols, row + 1, col, isVisited)
                + movingCountCore(threshold, rows, cols, row, col - 1, isVisited)
                + movingCountCore(threshold, rows, cols, row, col + 1, isVisited);
    }
 
    private int cal(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}