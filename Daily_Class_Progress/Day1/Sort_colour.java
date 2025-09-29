package Day1;

import java.util.HashMap;
import java.util.Scanner;

public class Sort_colour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");

        }
        sc.close();
    }

    public static void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int i = 0;
        for (int a : map.keySet()) {
            int j = map.get(a);
            while (j-- > 0) {
                nums[i] = a;
                i++;
            }
        }
    }
}
