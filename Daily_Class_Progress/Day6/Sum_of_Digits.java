package Day6;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(f(x, y));
        sc.close();
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }

    public static int f(int x, int y) {
        if (y == 0 || x == y) {
            return 1;
        }
        return f(x - 1, y) + f(x - 1, y - 1);
    }

}
