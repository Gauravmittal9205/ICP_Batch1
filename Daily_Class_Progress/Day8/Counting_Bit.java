package Day8;

import java.util.Scanner;

public class Counting_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countBits(n));
        sc.close();
    }

    public static int[] countBits(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i >> 1] + i % 2;
        }
        return dp;
    }

}
