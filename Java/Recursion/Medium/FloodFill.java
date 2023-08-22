package Java.Recursion.Medium;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n,m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];
        System.out.println("Enter board entries!");
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j) {
                board[i][j] = sc.nextInt();
            }

        printFloodPaths(board, n, m);

        sc.close();
    }

    public static void printFloodPaths(int[][] board, int n, int m) {

        boolean[][] visited = new boolean[n][m];
        helper(board, 0, 0, n, m, visited, "");

    }

    static void helper(int[][] board, int r, int c, int n, int m, boolean[][] visited, String result) {
        if (r < 0 || c < 0 || c == m || r == n || board[r][c] == 1 || visited[r][c] == true)
            return;
        if (r == n - 1 && c == m - 1) {
            System.out.println(result);
            return;
        }
        visited[r][c] = true;
        helper(board, r - 1, c, n, m, visited, result + "T");
        helper(board, r, c - 1, n, m, visited, result + "L");
        helper(board, r + 1, c, n, m, visited, result + "D");
        helper(board, r, c + 1, n, m, visited, result + "R");
        visited[r][c] = false;
    }
}
