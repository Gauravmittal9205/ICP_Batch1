package Coding_Pool_30_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_bags_wit_full_capacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int add = sc.nextInt();
        System.out.println(maximumBags(nums, arr, add));
        sc.close();
    }

    public static int maximumBags(int[] capacity, int[] rocks, int add) {
        int[][] a = new int[rocks.length][2];
        for (int i = 0; i < rocks.length; i++) {
            a[i][0] = capacity[i];
            a[i][1] = rocks[i];
        }
        int c = 0;
        Arrays.sort(a, (b, d) -> (b[0] - b[1]) - (d[0] - d[1]));
        for (int i = 0; i < a.length; i++) {
            if (a[i][0] - a[i][1] <= add) {
                c++;
                add -= (a[i][0] - a[i][1]);
            }
        }
        return c;
    }

}
