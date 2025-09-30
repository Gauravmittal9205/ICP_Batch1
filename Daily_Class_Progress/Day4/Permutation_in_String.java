package Day4;

import java.util.Scanner;

public class Permutation_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(checkInclusion(s1, s2));
        sc.close();
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }
        int i = 0;
        int j = 0;
        int freq2[] = new int[26];
        while (j < s2.length()) {
            freq2[s2.charAt(j) - 'a']++;
            if ((j - i + 1) > s1.length()) {
                freq2[s2.charAt(i) - 'a']--;
                i++;
            }
            if (frequency(freq1, freq2)) {
                return true;
            }
            j++;
        }
        return false;
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
