package Day6;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(check(s, 0, s.length() - 1));
        sc.close();
    }

    public static boolean check(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        } else {
            return check(s, i + 1, j - 1);
        }
    }

}
