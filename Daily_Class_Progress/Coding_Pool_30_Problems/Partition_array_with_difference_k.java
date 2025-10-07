package Coding_Pool_30_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Partition_array_with_difference_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        System.out.println(partitionArray(time, target));
        sc.close();
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        int p = 0;
        int l = 0;
        for (int s = 1; s < nums.length; s++) {
            if (nums[l] - nums[s] > k) {
                p++;
                l = s;
            }
        }

        return p + 1;

    }

}
