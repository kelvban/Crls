package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonSubString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            char[] c1 = str.toCharArray();
            char[] c2 = br.readLine().toCharArray();
            int[][] lengthMatrix = new int[c1.length + 1][c2.length + 1];
            for(int i = 0; i <= c1.length; i++) {
                lengthMatrix[i][0] = 0;
            }
            for(int i = 0; i <= c2.length; i++) {
                lengthMatrix[0][i] = 0;
            }
            int max = 0;
            for(int i = 0; i < c1.length; i++) {
                for(int j = 0; j < c2.length; j++) {
                    if(c1[i] == c2[j]) {
                        lengthMatrix[i + 1][j + 1] = lengthMatrix[i][j] + 1;
                        if(lengthMatrix[i + 1][j + 1] > max)
                            max = lengthMatrix[i + 1][j + 1];
                    }
                }
            }
            System.out.println(max);
        }
    }
}