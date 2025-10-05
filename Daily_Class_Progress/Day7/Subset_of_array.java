package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> li = subsets(nums);
        System.out.println(li);
        sc.close();
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        subset(nums, li, a, 0);
        return li;
    }

    public static void subset(int[] arr, List<List<Integer>> li, List<Integer> a, int i) {
        if (i == arr.length) {
            li.add(new ArrayList<>(a));
            return;
        }
        a.add(arr[i]); // Pick the element
        subset(arr, li, a, i + 1); // Call after picking
        a.remove(a.size() - 1); // Not pick the element
        subset(arr, li, a, i + 1); // Call after not pick the element
    }

}

// Without Base Case Condition

// li.add(new ArrayList<>(a));
// for(int j=i;j<arr.length;j++){
// a.add(arr[j]);
// subset(arr,li,a,j+1);
// a.remove(a.size()-1);
// }