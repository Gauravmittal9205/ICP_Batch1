package Day5;

import java.util.Scanner;

public class Jump_Game_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(jump(nums));
        sc.close();
    }

    public static int jump(int[] nums) {
        int maxjump = 0;
        int endjump = 0;
        int jump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxjump = Math.max(maxjump, i + nums[i]);
            if (i == endjump) {
                jump++;
                endjump = maxjump;
            }
        }
        return jump;

    }
}
