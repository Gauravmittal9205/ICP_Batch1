package Day6;

import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, 0, 0));
        sc.close();
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
