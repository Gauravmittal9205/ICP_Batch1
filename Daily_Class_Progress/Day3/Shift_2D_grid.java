package Day3;

import java.util.*;

public class Shift_2D_grid {
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
        int k = sc.nextInt();
        System.out.println((shiftGrid(a, k)));
        sc.close();
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> li = new ArrayList<>();
        while (k-- > 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    swap(grid, i, j);
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                a.add(grid[i][j]);
            }
            li.add(new ArrayList<>(a));
        }
        return li;
    }

    public static void swap(int grid[][], int i, int j) {
        int temp = grid[i][j];
        grid[i][j] = grid[0][0];
        grid[0][0] = temp;
    }
}
