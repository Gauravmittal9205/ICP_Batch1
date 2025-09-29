package Day1;

import java.util.Scanner;

public class Product_of_Array_Except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println(productExceptSelf(nums));
        sc.close();
    }

    // Approch (Two pass)
    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;

    }
    // It can not be done in single pass as
}
