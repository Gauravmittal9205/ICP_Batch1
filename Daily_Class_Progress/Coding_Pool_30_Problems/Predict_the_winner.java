package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Predict_the_winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(predictTheWinner(a));
        sc.close();
    }

    public static boolean predictTheWinner(int[] nums) {
        int dp[][] = new int[nums.length][nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int p1 = optimal(nums, 0, nums.length - 1, dp);
        int p2 = sum - p1;
        return p1 >= p2;

    }

    public static int optimal(int[] arr, int i, int j, int dp[][]) {
        if (i > j) {
            return 0;
        }
        if (dp[i][j] == -1) {
            return dp[i][j];
        }
        int f = arr[i] + Math.min(optimal(arr, i + 2, j, dp), optimal(arr, i + 1, j - 1, dp));
        int l = arr[j] + Math.min(optimal(arr, i + 1, j - 1, dp), optimal(arr, i, j - 2, dp));
        return dp[i][j] = Math.max(f, l);
    }
}
