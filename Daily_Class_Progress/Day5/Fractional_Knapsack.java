package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Fractional_Knapsack {
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
        int capacity = sc.nextInt();
        System.out.println(fractionalKnapsack(nums1, nums2, capacity));
        sc.close();
    }

    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = wt.length;
        int[][] item = new int[n][2];
        for (int i = 0; i < n; i++) {
            item[i][0] = wt[i];
            item[i][1] = val[i];
        }
        Arrays.sort(item, (a, b) -> Double.compare((double) b[1] / b[0], (double) a[1] / a[0]));
        int currcap = 0;
        double ans = 0;
        int i = 0;
        while (i < n && currcap < capacity) {
            if (currcap + item[i][0] <= capacity) {
                currcap += item[i][0];
                ans += item[i][1];
            } else {
                int rem = capacity - currcap;
                ans += (double) rem * ((double) item[i][1] / item[i][0]);
                currcap += rem;
            }
            i++;
        }
        return ans;
    }
}
