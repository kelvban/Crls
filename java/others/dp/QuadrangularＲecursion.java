import java.util.Scanner;

/**
 * For n * m matrix, each lattice has a number. A starts from (1,1) and can only
 * go down or right, and the end point is (n, m). B starts from (n, 1) and can
 * only go up or right, and the end point is (1, m). Two people's speed is not
 * the same, go to the grid can get the number of the grid, two people meet the
 * grid on the number of two people can not take. Find the maximum of the sum of
 * the numbers A and B can get.
 */
public class QuadrangularＲecursion {
    public static int[][] dp1 = new int[1010][1010];
	public static int[][] dp2 = new int[1010][1010];
	public static int[][] dp3 = new int[1010][1010];
	public static int[][] dp4 = new int[1010][1010];
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int[][] arrays= new int[x+4][y+4];
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				arrays[i][j] = scanner.nextInt();
			}
		}
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				dp1[i][j] = Math.max(arrays[i-1][j], arrays[i][j-1])+arrays[i][j];
			}
		}
		for (int i = x; i >= 1; i--) {
			for (int j = y; j >= 1; j--) {
				dp2[i][j] = Math.max(arrays[i][j+1], arrays[i+1][j])+arrays[i][j];
			}
		}
		for (int i = x; i >= 1; i--) {
			for (int j = 1; j <= y; j++) {
				dp4[i][j] = Math.max(arrays[i][j-1], arrays[i+1][j])+arrays[i][j];
			}
		}
		for (int i = 1; i <= x; i++) {
			for (int j = y; j >= 1; j--) {
				dp3[i][j] = Math.max(arrays[i-1][j], arrays[i][j+1])+arrays[i][j];
			}
		}
		int result = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				result = Math.max(result, dp1[i-1][j]+dp2[i+1][j]+dp4[i][j-1]+dp3[i][j+1]);
				result = Math.max(result, dp1[i][j-1]+dp2[i][j+1]+dp3[i-1][j]+dp4[i+1][j]);
			}
		}
		System.out.println(result);
		scanner.close();
	}

}