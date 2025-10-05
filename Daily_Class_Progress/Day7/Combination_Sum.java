package Day7;

import java.util.*;

public class Combination_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<List<Integer>> li = combinationSum(arr, target);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        combination(candidates, target, a, li, 0, 0);
        return li;
    }

    public static void combination(int[] arr, int target, List<Integer> a, List<List<Integer>> li, int sum, int ind) {
        if (sum == target) {
            li.add(new ArrayList<>(a));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if ((sum + arr[i]) <= target) {
                a.add(arr[i]);
                combination(arr, target, a, li, sum + arr[i], i);
                a.remove(a.size() - 1);
            }
        }
    }
}
