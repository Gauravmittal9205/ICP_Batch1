package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_All_Anagram_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(findAnagrams(s1, s2));
        sc.close();
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> a = new ArrayList<>();
        int[] freq1 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
        }
        int i = 0;
        int j = 0;
        int freq2[] = new int[26];
        while (j < s.length()) {
            freq2[s.charAt(j) - 'a']++;
            if ((j - i + 1) > p.length()) {
                freq2[s.charAt(i) - 'a']--;
                i++;
            }
            if (frequency(freq1, freq2)) {
                a.add(i);
            }
            j++;
        }
        return a;
    }

    public static boolean frequency(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}
