package Assignment7;

import java.util.Scanner;

public class Maximum_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
        sc.close();
    }

    public static int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int maxsum = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            maxsum = Math.max(maxsum, dp[i]);
        }
        return maxsum;
    }

}
