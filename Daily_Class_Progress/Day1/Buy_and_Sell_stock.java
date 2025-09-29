package Day1;

import java.util.Scanner;

public class Buy_and_Sell_stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProfit(nums));

        sc.close();
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int maxpro = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                if (prices[i] - buy > maxpro) {
                    maxpro = prices[i] - buy;
                }
            }
        }
        return maxpro;

    }
}
