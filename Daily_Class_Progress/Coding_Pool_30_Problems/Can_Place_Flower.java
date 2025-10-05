package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Can_Place_Flower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(canPlaceFlowers(nums, k));
        sc.close();
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        if (n <= 0) {
            return true;
        }
        return false;
    }
}
