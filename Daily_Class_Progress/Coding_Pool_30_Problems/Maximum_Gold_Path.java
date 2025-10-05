package Coding_Pool_30_Problems;

import java.util.Scanner;

public class Maximum_Gold_Path {
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
        System.out.println(getMaximumGold(a));
        sc.close();

    }

    public static int getMaximumGold(int[][] grid) {
        int max_gold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    max_gold = Math.max(max_gold, dfs(grid, i, j));
                }
            }
        }
        return max_gold;
    }

    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] == 0) {
            return 0;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        int maxgold = 0;
        maxgold = Math.max(maxgold, dfs(grid, i - 1, j));
        maxgold = Math.max(maxgold, dfs(grid, i + 1, j));
        maxgold = Math.max(maxgold, dfs(grid, i, j - 1));
        maxgold = Math.max(maxgold, dfs(grid, i, j + 1));
        grid[i][j] = temp;
        return maxgold + temp;
    }

}
