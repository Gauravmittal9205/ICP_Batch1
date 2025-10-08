package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_cost_climbing_stair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minCostClimbingStairs(a));
        sc.close();
    }

    public static int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[1001];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, cost, dp), solve(1, cost, dp));
    }

    public static int solve(int ind, int[] cost, int dp[]) {
        if (ind >= cost.length) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }

        int a = cost[ind] + solve(ind + 1, cost, dp);
        int b = cost[ind] + solve(ind + 2, cost, dp);
        return dp[ind] = Math.min(a, b);
    }

}
