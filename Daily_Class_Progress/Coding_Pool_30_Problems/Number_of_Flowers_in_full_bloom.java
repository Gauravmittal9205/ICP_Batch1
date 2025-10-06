package Coding_Pool_30_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_Flowers_in_full_bloom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flower[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            flower[i][0] = sc.nextInt();
            flower[i][1] = sc.nextInt();
        }
        int m = sc.nextInt();
        int people[] = new int[m];
        for (int i = 0; i < m; i++) {
            people[i] = sc.nextInt();
        }
        int a[] = fullBloomFlowers(flower, people);
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = flowers[i][0];
            arr2[i] = flowers[i][1];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] a = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            int start = search_start(arr1, people[i]);
            int stop = search_stop(arr2, people[i]);
            a[i] = start - stop;
        }
        return a;
    }

    public static int search_start(int[] arr, int time) {
        int low = 0;
        int high = arr.length - 1;
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= time) {
                pos = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos + 1;
    }

    public static int search_stop(int[] arr, int time) {
        int low = 0;
        int high = arr.length - 1;
        int pos = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < time) {
                pos = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos + 1;
    }

}
