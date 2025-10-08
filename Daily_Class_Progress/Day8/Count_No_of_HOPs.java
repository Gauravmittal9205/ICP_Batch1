package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Count_No_of_HOPs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }

    public static int countWays(int n) {
        // add your code here
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static int solve(int n, int[] dp) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp) + solve(n - 3, dp);
    }

}
