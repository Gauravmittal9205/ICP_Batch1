package Day2;

import java.util.Scanner;

public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
        sc.close();
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // left half
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && nums[mid] >= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // right half
            else {
                if (nums[high] >= target && nums[mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;

    }
}
