package Day5;

import java.util.Scanner;

public class Candy_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(candy(nums));
        sc.close();
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] can = new int[n];
        for (int i = 0; i < n; i++) {
            can[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                can[i] = can[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                can[i] = Math.max(can[i], can[i + 1] + 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += can[i];
        }
        return sum;

    }

}
