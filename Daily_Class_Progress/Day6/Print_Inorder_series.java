package Day6;

import java.util.Scanner;

public class Print_Inorder_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }

    public static void print(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
        print(n - 1);
    }

}
