package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class House_Robber_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        if (nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int a = robber(nums, 0, nums.length - 2, dp1);
        int b = robber(nums, 1, nums.length - 1, dp2);
        System.out.println(Math.max(a, b));

    }

    public static int robber(int[] arr, int i, int j, int[] dp) {
        if (i > j) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + robber(arr, i + 2, j, dp);
        int dont_rob = robber(arr, i + 1, j, dp);
        return dp[i] = Math.max(rob, dont_rob);

    }
}
