package Day3;

import java.util.*;

public class Matrix_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = { { 1, 2, 3, 7 }, { 4, 5, 6, 8 }, { 7, 8, 9, 9 } };
        row_wise(matrix);
        System.out.println();
        column_wise(matrix);
        System.out.println();
        spiral(matrix);
        System.out.println();
        reverse(matrix);
        sc.close();
    }

    public static void row_wise(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Row wise Traversal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }

    public static void column_wise(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Column Wise Traversal: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }

    }

    public static void spiral(int[][] matrix) {
        System.out.println("Spiral Traversal: ");
        int n = matrix.length;
        int m = matrix[0].length;
        int minc = 0, minr = 0, maxr = n - 1, maxc = m - 1;
        int te = n * m;
        while (te > 0) {
            for (int i = minc; i <= maxc && te > 0; i++) {
                System.out.print(matrix[minr][i] + " ");
                te--;
            }
            minr++;
            for (int i = minr; i <= maxr && te > 0; i++) {
                System.out.print(matrix[i][maxc] + " ");
                te--;
            }
            maxc--;
            for (int i = maxc; i >= minc && te > 0; i--) {
                System.out.print(matrix[maxr][i] + " ");
                te--;
            }
            maxr--;
            for (int i = maxr; i >= minr && te > 0; i--) {
                System.out.print(matrix[i][minc] + " ");
                te--;
            }
            minc++;
        }
    }

    public static void reverse(int[][] matrix) {
        System.out.println("Reverse Traversal: ");
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

}
