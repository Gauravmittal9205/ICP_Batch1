package Day3;

import java.util.Scanner;

public class Search_in_2D_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(search(a, target));
        sc.close();

    }

    public static boolean search(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = matrix[i].length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

        }
        return false;

    }

}
