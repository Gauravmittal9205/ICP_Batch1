package Day1;

import java.util.*;

public class Majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        System.out.println(majorityElement(nums));
        sc.close();
    }

    // Approach 1(Boyer Moore Voting)
    // public static int majorityElement(int[] nums) {
    // int a = nums[0];
    // int v = 1;
    // for (int i = 1; i < nums.length; i++) {
    // if (nums[i] == a) {
    // v++;
    // } else {
    // v--;
    // if (v == 0) {
    // a = nums[i];
    // v = 1;
    // }
    // }
    // }
    // return a;
    // }

    // Approach 2(HashMap- Frequecy check)
    public static int majorityElement(int[] nums) {
        int half = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        int ele = 0;
        for (int a : map.keySet()) {
            if (map.get(a) > half) {
                ele = a;
            }
        }
        return ele;

    }
}