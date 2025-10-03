package Assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> li = combine(n, k);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        combination(1, n, k, ans, ll);
        return ans;

    }

    public static void combination(int start, int n, int k, List<List<Integer>> ans, List<Integer> ll) {
        if (k == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        if (start > n) {
            return;
        }
        ll.add(start);
        combination(start + 1, n, k - 1, ans, ll);
        ll.remove(ll.size() - 1);
        combination(start + 1, n, k, ans, ll);
    }

}
