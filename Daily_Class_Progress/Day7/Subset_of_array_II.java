package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Subset_of_array_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> li = subsetsWithDup(nums);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, li, a, 0);
        return li;

    }

    public static void subset(int nums[], List<List<Integer>> li, List<Integer> a, int ind) {
        if (ind == nums.length) {
            if (!li.contains(a)) {
                li.add(new ArrayList<>(a));
            }
            return;
        }
        a.add(nums[ind]);
        subset(nums, li, a, ind + 1);
        a.remove(a.size() - 1);
        subset(nums, li, a, ind + 1);

    }

}
