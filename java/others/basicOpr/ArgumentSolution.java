package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArgumentSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = read.readLine()) != null) {
            char[] cha = str.toCharArray();
            StringBuffer sb = new StringBuffer();
            int flag = 0;
            int count = 1;
            for (int i = 0; i < cha.length; ++i) {
                if (cha[i] == '\"') {
                    flag++;
                    continue;
                }
                if (cha[i] != ' ') {
                    sb.append(cha[i]);
                }
                if (cha[i] == ' ' && flag % 2 != 0) {
                    sb.append(cha[i]);
                }
                if (cha[i] == ' ' && flag % 2 == 0) {
                    sb.append("\n");
                    ++count;
                }
            }
            System.out.println(count + "\n" + sb.toString());
        }
    }
}