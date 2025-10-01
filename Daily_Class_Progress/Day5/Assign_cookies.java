package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Assign_cookies {
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
        System.out.println(findContentChildren(nums1, nums2));
        sc.close();
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

}
