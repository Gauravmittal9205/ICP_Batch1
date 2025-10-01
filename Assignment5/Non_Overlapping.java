package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Non_Overlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        System.out.println(eraseOverlapIntervals(nums));
        sc.close();
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int end = intervals[0][1];
        ;
        int c = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (end > intervals[i][0]) {
                c++;
            } else {
                end = intervals[i][1];
            }
        }
        return c;
    }

}
