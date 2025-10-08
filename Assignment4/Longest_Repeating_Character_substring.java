package Assignment4;

import java.util.Scanner;

public class Longest_Repeating_Character_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(characterReplacement(str, k));
        sc.close();
    }

    public static int characterReplacement(String s, int k) {
        int maxf = 0;
        int i = 0;
        int j = 0;
        int[] freq = new int[26];
        while (j < s.length()) {
            freq[s.charAt(j) - 'A']++;
            maxf = Math.max(maxf, freq[s.charAt(j) - 'A']);
            if ((j - i + 1) - maxf > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            j++;
        }
        return j - i;
    }
}
