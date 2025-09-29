package Day1;

import java.util.Scanner;

public class count_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }

    // Brute Force Approach
    // Traverse over 2 to n and check each number as a prime or not and count all
    // prime numbers

    // Optimize Approach (Sieve of Entrosthene)
    public static int count(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 0;
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 0;
        for (int i = 2; i < n; i++) {
            a[i] = 1;
        }
        for (int i = 2; i * i < n; i++) {
            if (a[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    a[j] = 0;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                c++;
            }
        }
        return c;
    }
}
