package Day2;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        selectionSort(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }

    public static void selectionSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int small_ind = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[small_ind] > nums[j]) {
                    small_ind = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[small_ind];
            nums[small_ind] = temp;
        }
    }
}
