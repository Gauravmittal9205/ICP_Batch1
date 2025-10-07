package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Maximum_69_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maximum69Number(n));
        sc.close();
    }

    public static int maximum69Number(int num) {
        String s = String.valueOf(num);
        String str = "";
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6' && flag == 0) {
                str = str + "9";
                flag = 1;
            } else if (s.charAt(i) == '6' && flag == 1) {
                str = str + "6";
            } else {
                str = str + s.charAt(i);
            }

        }
        return Integer.parseInt(str);

    }

}
