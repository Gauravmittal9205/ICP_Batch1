package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Koko_Eating_Banana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        System.out.println(minEatingSpeed(nums, h));
        sc.close();
    }

    // Binary Search Approach
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);
        int low = 1;
        int high = piles[n - 1];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean possible(int[] piles, int h, int mid) {
        int hour = 0;
        for (int i = 0; i < piles.length; i++) {
            hour += Math.ceil(piles[i] / (double) mid);
        }
        if (hour <= h) {
            return true;
        }
        return false;
    }

    // Brute force Approach
    // int min=piles[n-1];for(
    // int i = 1;i<=piles[n-1];i++)
    // {
    // int hour = 0;
    // for (int j = 0; j < n; j++) {
    // hour += Math.ceil(piles[j] / (double) i);
    // }
    // if (hour <= h) {
    // min = Math.min(min, i);
    // }
    // }
    // return min;

}
