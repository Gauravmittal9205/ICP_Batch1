package Day3;

import java.util.Scanner;
import java.util.Stack;

public class Help_classmate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int arr[] = help_classmate(nums, nums.length);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static int[] help_classmate(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] a = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() >= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                a[i] = -1;
            } else {
                a[i] = st.peek();
            }

            st.push(arr[i]);
        }
        return a;

    }

}
