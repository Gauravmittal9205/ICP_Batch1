package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_arrow_burst_balloon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        System.out.println(findMinArrowShots(nums));

        sc.close();
    }

    public static int findMinArrowShots(int[][] points) {
        // First sort the array using the comparator
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrow = 1;

        // Now set the end index to point[0]
        int end = points[0][1];

        // Traverse on points and compare the first index of ballon i with end indexof
        // ballon i-1
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrow++;
                end = points[i][1];
            }
        }
        return arrow;
    }

}
