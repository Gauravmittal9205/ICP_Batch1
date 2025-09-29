package Day2;

import java.util.Scanner;

public class lower_bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(low_bound(nums, target));
        sc.close();
    }
    // Approach 1(Brute force)(O(n))
    // public static int low_bound(int nums[], int target) {
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] >= target) {
    // return i;
    // }
    // }
    // return nums.length;
    // }

    // Approach 2(Binary Search)(O(logn))
    public static int low_bound(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}
