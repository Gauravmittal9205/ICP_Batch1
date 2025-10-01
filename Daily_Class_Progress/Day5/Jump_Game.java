package Day5;

import java.util.Scanner;

public class Jump_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(canJump(nums));
        sc.close();
    }

    public static boolean canJump(int[] nums) {
        int maxreach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxreach) {
                return false;
            }
            maxreach = Math.max(maxreach, i + nums[i]);
        }
        return true;
    }

}
