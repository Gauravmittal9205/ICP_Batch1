package Day8;

import java.util.Scanner;

public class Minimum_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minOperation(n));
        sc.close();
    }

    public static int minOperation(int n) {
        // code here.
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
    }

}
