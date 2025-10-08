package Day9;

import java.util.*;

public class Coin_change2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(change(target, arr));
        sc.close();

    }

    public static int change(int amount, int[] coins) {
        int dp[][] = new int[amount + 1][coins.length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return coin(coins, amount, 0, dp);
    }

    public static int coin(int[] coins, int amt, int i, int dp[][]) {
        int inc = 0, exc = 0;
        if (amt == 0) {
            return 1;
        }
        if (i == coins.length) {
            return 0;
        }
        if (dp[amt][i] != -1) {
            return dp[amt][i];
        }

        if (amt >= coins[i]) {
            inc = coin(coins, amt - coins[i], i, dp);
        }

        exc = coin(coins, amt, i + 1, dp);
        return dp[amt][i] = inc + exc;
    }

}
