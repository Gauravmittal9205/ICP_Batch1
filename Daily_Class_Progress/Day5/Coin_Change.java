package Day5;

import java.util.Scanner;

public class Coin_Change {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findMin(n));
        sc.close();

    }

    public static int findMin(int n) {
        // code here
        int coin = 0;
        while (n > 0) {
            if (n >= 10) {
                coin += (n / 10);
                n -= (n / 10) * 10;
            } else if (n >= 5) {
                coin += (n / 5);
                n -= (n / 5) * 5;
            } else if (n >= 2) {
                coin += (n / 2);
                n -= (n / 2) * 2;
            } else if (n >= 1) {
                coin += (n / 1);
                n -= (n / 1) * 1;
            }
        }
        return coin;
    }
}