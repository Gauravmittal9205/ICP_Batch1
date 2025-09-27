package Assignment2;

import java.util.*;

public class Kth_largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findKthLargest(nums, k));

        sc.close();
    }

    // Approach 1(Brute Force (nlogn))
    // public static int findKthLargest(int[] nums, int k) {
    // Arrays.sort(nums);
    // return nums[nums.length-k];
    // }

    // Approach 2(Optimize)
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.add(nums[i]);
            } else if (nums[i] > pq.peek()) {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
