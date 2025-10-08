package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class House_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(robber(a, 0, dp));
        sc.close();
    }

    public static int robber(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + robber(arr, i + 2, dp);
        int dont_rob = robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);

    }
}
