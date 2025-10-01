package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Activity_Selection {
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
        System.out.println(activitySelection(nums1, nums2));
        sc.close();
    }

    public static int activitySelection(int[] start, int[] finish) {
        // code here
        int[][] act = new int[start.length][2];
        for (int i = 0; i < start.length; i++) {
            act[i][0] = start[i];
            act[i][1] = finish[i];
        }
        Arrays.sort(act, (a, b) -> Integer.compare(a[1], b[1]));
        int last = act[0][1];
        int ans = 1;
        for (int i = 1; i < start.length; i++) {
            if (act[i][0] > last) {
                ans++;
                last = act[i][1];
            }
        }
        return ans;

    }

}
