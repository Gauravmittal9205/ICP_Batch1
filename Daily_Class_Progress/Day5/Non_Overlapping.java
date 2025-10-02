package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Non_Overlapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(eraseOverlapIntervals(a));

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
