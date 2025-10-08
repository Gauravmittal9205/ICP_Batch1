package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_path_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(minPathSum(mat));
        sc.close();
    }

    public static int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for (int a[] : dp) {
            Arrays.fill(a, -1);
        }
        return min_path(grid, 0, 0, dp);

    }

    public static int min_path(int[][] grid, int cr, int cc, int dp[][]) {
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }
        if (cc == grid[0].length || cr == grid.length) {
            return Integer.MAX_VALUE;
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int d = min_path(grid, cr + 1, cc, dp);
        int r = min_path(grid, cr, cc + 1, dp);
        return dp[cr][cc] = Math.min(d, r) + grid[cr][cc];
    }

}
