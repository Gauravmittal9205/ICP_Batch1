package Day7;

import java.util.Scanner;

public class Sudoku_Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        helper(a, 0, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }

    public static boolean helper(int mat[][], int row, int col) {
        if (col == mat.length) {
            row++;
            col = 0;
        }
        if (row == mat.length) {
            return true;
        }
        if (mat[row][col] != 0) {
            return helper(mat, row, col + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(mat, row, col, i)) {
                    mat[row][col] = i;
                    if (helper(mat, row, col + 1)) {
                        return true;
                    } else {
                        mat[row][col] = 0;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int mat[][], int row, int col, int val) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[row][i] == val) {
                return false;
            }
            if (mat[i][col] == val) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (mat[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

}
