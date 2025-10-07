package Coding_Pool_30_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_Maximum_pair_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println(minPairSum(nums));
        sc.close();
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int min = 0;
        while (i < j) {
            min = Math.max(nums[i] + nums[j], min);
            i++;
            j--;

        }
        return min;
    }

}
