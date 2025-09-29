package Day2;

import java.util.Scanner;

public class Median_Of_Soretd_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(nums1, nums2));
        sc.close();
    }

    // Approach 1(TC => (O(n+m)))
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int a[] = new int[n + m];
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        if (n == 0) {
            while (j >= 0) {
                a[k] = nums2[j];
                k--;
                j--;
            }
        }
        if (m == 0) {
            while (i >= 0) {
                a[k] = nums1[i];
                k--;
                i--;
            }
        }
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                a[k] = nums1[i];
                k--;
                if (i == 0) {
                    while (j >= 0) {
                        a[k] = nums2[j];
                        k--;
                        j--;
                    }
                }
                i--;
            } else {
                a[k] = nums2[j];
                k--;
                if (j == 0) {
                    while (i >= 0) {
                        a[k] = nums1[i];
                        k--;
                        i--;
                    }
                }
                j--;

            }
        }
        if (n + m == 1) {
            return (double) (a[0]);
        }
        if ((n + m) % 2 == 0) {
            return (a[(m + n) / 2] + a[(m + n) / 2 - 1]) / (double) 2;
        }
        return a[(n + m) / 2];
    }
}
