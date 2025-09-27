package Assignment2;

import java.util.*;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums1[] = new int[n + m];
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Approach 1 (Inserting all elements of num2 into num1 and then sort num1) (TC:
        // O(nlogn))
        // int j = 0;
        // for (int i = m; i < m + n; i++) {
        // nums1[i] = nums2[j];
        // j++;
        // }
        // Arrays.sort(nums1);

        merge(nums1, m, nums2, n);
        for (int i = 0; i < n + m; i++) {
            System.out.print(nums1[i] + " ");
        }

        sc.close();
    }

    // Approach 2 (Optimize -> (O(n+m)))
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            int c = 0;
            while (c < n) {
                nums1[c] = nums2[c];
                c++;
            }
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                if (i == 0) {
                    while (j >= 0) {
                        nums1[k] = nums2[j];
                        j--;
                        k--;
                    }
                }
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }
}
