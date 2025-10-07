package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Three_Sum_Closest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        System.out.println(threeSumClosest(time, target));
        sc.close();
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closestsum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < Math.abs(closestsum - target)) {
                        closestsum = sum;
                    }
                }
            }
        }
        return closestsum;
    }
}
