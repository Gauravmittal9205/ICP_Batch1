package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Beautiful_Arrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countArrangement(n));
        sc.close();
    }

    static int count = 0;

    public static int countArrangement(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        permute(a, 0);
        return count;

    }

    public static void permute(int[] nums, int k) {
        if (k == nums.length) {
            count++;
        }
        for (int i = k; i < nums.length; i++) {
            swap(nums, i, k);
            if (nums[k] % (k + 1) == 0 || (k + 1) % nums[k] == 0) {
                permute(nums, k + 1);
            }
            swap(nums, i, k);

        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
