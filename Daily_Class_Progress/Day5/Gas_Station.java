package Day5;

import java.util.Scanner;

public class Gas_Station {
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
        System.out.println(canCompleteCircuit(nums1, nums2));
        sc.close();
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalcost += cost[i];
            totalgas += gas[i];
        }
        if (totalgas < totalcost) {
            return -1;
        }
        int start = 0;
        int curr = 0;
        for (int i = 0; i < gas.length; i++) {
            curr += gas[i] - cost[i];
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }
        }
        return start;
    }

}
