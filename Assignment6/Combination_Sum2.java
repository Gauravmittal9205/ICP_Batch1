package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<List<Integer>> li = combinationSum2(arr, target);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, target, ll, 0, ans, 0);

        return ans;
    }

    public static void combination(int[] arr, int amount, List<Integer> a, int idx, List<List<Integer>> ans, int sum) {
        if (sum == amount) {
            ans.add(new ArrayList<>(a));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (sum + arr[i] > amount) {
                break;
            }
            if (sum + arr[i] <= amount) {
                a.add(arr[i]);

                combination(arr, amount, a, i + 1, ans, sum + arr[i]);
                a.remove(a.size() - 1);
            }
        }
    }

}
