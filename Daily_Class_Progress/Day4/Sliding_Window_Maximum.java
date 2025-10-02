package Day4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxSlidingWindow(nums, k));
        sc.close();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int windows = n - k + 1;
        int[] a = new int[windows];
        int j = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            while (q.size() > 0 && nums[q.peekLast()] <= nums[i]) {
                q.removeLast();
            }
            q.add(i);
        }
        for (int i = k; i < n; i++) {
            a[j] = nums[q.peek()];
            j++;
            while (q.size() > 0 && q.peek() <= i - k) {
                q.remove();
            }
            while (q.size() > 0 && nums[q.peekLast()] <= nums[i]) {
                q.removeLast();
            }
            q.add(i);
        }
        a[j] = nums[q.peek()];
        return a;

    }

}
