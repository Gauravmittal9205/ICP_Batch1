package Day2;

import java.util.Scanner;

public class Find_Peak_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(peak(nums));
        sc.close();
    }
    // Approach 1(TC => (O(n)))
    // public static int peak(int[] nums) {
    // int n = nums.length;
    // for (int i = 1; i < n - 1; i++) {
    // if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
    // return i;
    // }
    // }
    // if (n > 1 && nums[0] > nums[1]) {
    // return 0;
    // }
    // if (n > 1 && nums[n - 2] < nums[n - 1]) {
    // return n - 1;
    // }
    // return 0;
    // }

    // Approach 2(Binary Search) (TC => (O(logn)))
    public static int peak(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                high = mid - 1;
            } else if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

}
