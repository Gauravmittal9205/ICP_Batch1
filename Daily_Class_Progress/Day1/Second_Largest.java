package Day1;

import java.util.*;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(secondHighest(s));
        sc.close();
    }

    // Approach1(Two Pass)
    public static int secondHighest(String s) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) && !a.contains(s.charAt(i) - '0')) {
                a.add(s.charAt(i) - '0');
            }
        }
        int max = -1;
        int second = -1;
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        for (int num : a) {
            if (num > second && num != max) {
                return num;
            }
        }
        return second;
    }

    // Approach 2(Single Pass)
    // public static int secondHighest(String s) {
    // ArrayList<Integer> a = new ArrayList<>();
    // for (int i = 0; i < s.length(); i++) {
    // if (((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) &&
    // !a.contains(s.charAt(i) - '0')) {
    // a.add(s.charAt(i) - '0');
    // }
    // }
    // int max = -1;
    // int second = -1;
    // for (int num : a) {
    // if (num > max) {
    // second = max;
    // max = num;
    // } else if (num > second && num != max) {
    // second = num;
    // }
    // }
    // return second;
    // }

    // Approach 3(Check each numeric character)
    // public static int secondHighest(String s) {
    // int c=2;
    // for(char i='9';i>='0';i--){
    // if(s.indexOf(i)!=-1){
    // c--;
    // if(c==0){
    // return i-'0';
    // }
    // }
    // }
    // return -1;
    // }

}
