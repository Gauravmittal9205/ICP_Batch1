package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_units_on_a_truck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        int size = sc.nextInt();
        System.out.println(maximumUnits(nums, size));
        sc.close();
    }

    public static int maximumUnits(int[][] nums, int truckSize) {
        Arrays.sort(nums, (a, b) -> Integer.compare(b[1], a[1]));
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] <= truckSize) {
                max += nums[i][0] * nums[i][1];
                truckSize -= nums[i][0];
            } else {
                max += truckSize * nums[i][1];
                truckSize = 0;
            }

        }
        return max;

    }

}
