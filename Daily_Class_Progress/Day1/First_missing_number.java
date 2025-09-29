package Day1;

import java.util.*;

public class First_missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(firstMissingPositive(nums));

        sc.close();
    }

    // Approach 1(Using HashSet)
    // public static int firstMissingPositive(int[] nums) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int num : nums) {
    // if (num > 0) {
    // set.add(num);
    // }
    // }
    // for (int i = 1; i <= nums.length; i++) {
    // if (!set.contains(i)) {
    // return i;
    // }
    // }
    // return nums.length + 1;
    // }

    // Approach 2(Inplace swap or cyclic sort)
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
