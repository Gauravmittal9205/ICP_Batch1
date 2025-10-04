package Day7;

import java.util.Scanner;

public class Word_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char a[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        System.out.println(word_exist(a, word));
        sc.close();
    }

    public static boolean word_exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == words[0] && exist(board, i, j, words, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean exist(char[][] grid, int i, int j, char[] a, int ind) {
        if (i < 0 || j < 0 || j > grid[0].length - 1 || i > grid.length - 1 || grid[i][j] != a[ind]) {
            return false;
        }
        if (ind == a.length - 1) {
            return true;
        }
        char ch = grid[i][j];
        grid[i][j] = '*';
        boolean res = exist(grid, i - 1, j, a, ind + 1) || exist(grid, i + 1, j, a, ind + 1)
                || exist(grid, i, j - 1, a, ind + 1) || exist(grid, i, j + 1, a, ind + 1);
        grid[i][j] = ch;
        return res;
    }

}
