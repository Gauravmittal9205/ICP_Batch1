package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Platforms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(minPlatform(nums1, nums2));
        sc.close();
    }

    public static int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int max = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length && j < arr.length) {
            if (arr[i] <= dep[j]) {
                count++;
                max = Math.max(count, max);
                i++;
            } else {
                count--;
                j++;
            }
        }
        return max;
    }
}