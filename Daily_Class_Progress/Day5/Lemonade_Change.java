package Day5;

import java.util.Scanner;

public class Lemonade_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(lemonadeChange(nums));
        sc.close();
    }

    public static boolean lemonadeChange(int[] bills) {
        int cnt5 = 0;
        int cnt10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                cnt5++;
            } else if (bills[i] == 10) {
                if (cnt5 == 0) {
                    return false;
                } else {
                    cnt5--;
                    cnt10++;
                }
            } else {
                if (cnt5 == 0) {
                    return false;
                }
                if (cnt10 >= 1) {
                    cnt10 -= 1;
                    cnt5 -= 1;
                } else {
                    if (cnt5 >= 3) {
                        cnt5 -= 3;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}
