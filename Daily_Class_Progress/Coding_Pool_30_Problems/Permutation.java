package Coding_Pool_30_Problems;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        List<List<Integer>> li = permute(nums);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        permutation(nums, li, 0);
        return li;
    }

    public static void permutation(int[] nums, List<List<Integer>> li, int ind) {
        if (ind == nums.length) {
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                a.add(nums[i]);
            }
            li.add(a);
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(nums, ind, i);
            permutation(nums, li, ind + 1);
            swap(nums, ind, i);
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
