package Assignment2;

import java.util.Scanner;

public class Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
        sc.close();
    }

    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = 46340; // sqrt of (2^31)-1
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;

    }

}
