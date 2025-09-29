package Day3;

import java.util.Scanner;

public class HWI_query_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (type == 1) {
                for (int j = l; j <= r; j++) {
                    a[j] = (j - l + 1) * a[l];
                }

            } else {
                for (int j = l; j <= r; j++) {
                    sum += a[j];
                }
            }
        }
        System.out.println(sum % 1000000007);
        sc.close();
    }
}
