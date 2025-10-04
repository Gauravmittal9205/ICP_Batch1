package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome_Partioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<List<String>> li = partition(s);
        System.out.println(li);
        sc.close();
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> li = new ArrayList<>();
        List<String> a = new ArrayList<>();
        check(s, li, a);
        return li;

    }

    public static void check(String s, List<List<String>> li, List<String> a) {
        if (s.length() == 0) {
            li.add(new ArrayList<>(a));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String sub = s.substring(0, i);
            if (palindrome(sub)) {
                a.add(sub);
                check(s.substring(i), li, a);
                a.remove(a.size() - 1);
            }
        }
    }

    public static boolean palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
