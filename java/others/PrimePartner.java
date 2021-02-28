package others;

import java.io.*;
import java.util.*;

public class PrimePartner {
    static HashMap<String, Integer> hmap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readIn;
        while ((readIn = br.readLine()) != null) {
            int n = Integer.parseInt(readIn);
            String[] str_nums = br.readLine().split(" ");
            ArrayList<Integer> nums = new ArrayList<Integer>();
            int odd_count = 0;
            for (String s : str_nums) {
                int i = Integer.valueOf(s);
                nums.add(i);
                if (i % 2 == 1)
                    odd_count++;
            }
            int[] odd_nums = new int[odd_count], even_nums = new int[n - odd_count];
            int even_idx = 0, odd_idx = 0;
            for (int i : nums) {
                if (i % 2 == 0) {
                    even_nums[even_idx++] = i;
                } else {
                    odd_nums[odd_idx++] = i;
                }
            }
            int[] num = new int[n - odd_count];
            boolean[] used;
            int ans = 0;
            for (int i = 0; i < odd_count; i++) {
                used = new boolean[n - odd_count];
                if (find(odd_nums[i], even_nums, num, used)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean find(int n, int[] evens, int[] num, boolean[] used) {
        for (int i = 0; i < evens.length; i++) {
            if (isP(n + evens[i]) && !used[i]) {
                used[i] = true;
                if (num[i] == 0 || find(num[i], evens, num, used)) {
                    num[i] = n;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isP(int num) {
        if (num <= 3) {
            return num > 1;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}