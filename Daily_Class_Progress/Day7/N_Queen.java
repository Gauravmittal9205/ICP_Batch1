package Day7;

import java.util.*;

public class N_Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<String>> li = solveNQueens(n);
        System.out.println(li);
        sc.close();

    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> li = new ArrayList<>();
        String board[][] = new String[n][n];
        for (String b[] : board) {
            Arrays.fill(b, ".");
        }
        queens(board, n, 0, 0, li);
        return li;

    }

    public static void queens(String board[][], int n, int q, int row, List<List<String>> li) {
        if (q == n) {
            List<String> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(board[i][j]);
                }
                a.add(sb.toString());
            }
            li.add(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = "Q";
                queens(board, n, q + 1, row + 1, li);
                board[row][i] = ".";
            }
        }
    }

    public static boolean isSafe(String[][] board, int row, int col) {
        // up
        int r = row;
        while (r >= 0) {
            if (board[r][col] == "Q") {
                return false;
            }
            r--;
        }
        int cr = row;
        int cc = col;
        while (cr >= 0 && cc >= 0) {
            if (board[cr][cc] == "Q") {
                return false;
            }
            cr--;
            cc--;
        }
        cr = row;
        cc = col;
        while (cr >= 0 && cc < board.length) {
            if (board[cr][cc] == "Q") {
                return false;
            }
            cc++;
            cr--;
        }
        return true;

    }

}
