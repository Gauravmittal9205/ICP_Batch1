package Assignment3;

import java.util.*;

public class Matrix_traversal {
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
        spiral(a);

        sc.close();
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

}
