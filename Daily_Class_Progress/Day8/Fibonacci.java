package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        fibo(n, dp);
        // dp[0]=0;
        // dp[1]=1;
        // for(int i=2;i<n+1;i++){
        // dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        return dp[n];

    }

    public static int fibo(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);

    }
}
