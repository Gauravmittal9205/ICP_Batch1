package Day6;

import java.util.Scanner;

public class Solving_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(equation(n));
        sc.close();
    }

    public static int equation(int n) {
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return n + equation(n / 2);
        } else {
            return equation((n + 1) / 2) + equation((n - 1) / 2);
        }
    }

}
