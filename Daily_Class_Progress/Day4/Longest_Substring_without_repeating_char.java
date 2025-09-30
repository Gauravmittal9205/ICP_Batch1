package Day4;

import java.util.*;

public class Longest_Substring_without_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int si = 0;
        int ei = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (ei < s.length()) {
            if (!set.contains(s.charAt(ei))) {
                set.add(s.charAt(ei));
                max = Math.max(max, ei - si + 1);
                ei++;
            } else {
                set.remove(s.charAt(si));
                si++;
            }
        }
        System.out.println(max);
        sc.close();
    }

}
