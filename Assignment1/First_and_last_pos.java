package Assignment1;

import java.util.*;

public class First_and_last_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int a[] = new int[2];
        a[0] = search(nums, target, 0);
        a[1] = search(nums, target, 1);
        System.out.print(a[0] + " " + a[1]);
        sc.close();
    }

    public static int search(int[] nums, int target, int pos) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int ind = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ind = mid;
                if (pos == 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ind;

    }
}
