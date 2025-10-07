package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Subarray_product_less_Than_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        System.out.println(numSubarrayProductLessThanK(time, target));
        sc.close();
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0;
        int j = 0;
        long pro = 1;
        for (int i = 0; i < nums.length; i++) {
            pro *= nums[i];

            while (pro >= k && j < nums.length) {
                pro = pro / nums[j];
                j++;

            }
            c += 1 + i - j;
        }
        if (k == 0 || k == 1) {
            return 0;
        }
        return c;
    }

}
