package Coding_Pool_30_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Time_To_Complete_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();

        }
        int trip = sc.nextInt();
        System.out.println(minimumTime(time, trip));
        sc.close();
    }

    public static long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long low = 1;
        long high = (long) time[0] * totalTrips;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (possible(time, totalTrips, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static boolean possible(int a[], int t, long mid) {
        long trip = 0;
        for (int i = 0; i < a.length; i++) {
            trip += mid / a[i];
        }
        if (trip >= t) {
            return true;
        }
        return false;
    }
}
