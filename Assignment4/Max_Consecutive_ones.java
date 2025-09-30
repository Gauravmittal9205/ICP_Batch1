package Assignment4;

import java.util.Scanner;

public class Max_Consecutive_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(longestOnes(nums, k));
        sc.close();
    }

    public static int longestOnes(int[] nums, int k) {
        int zero = 0;
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < nums.length) {
            if (nums[j] == 0) {
                zero++;
            }
            while (zero > k) {
                if (nums[i] == 0) {
                    zero--;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;

    }
}
