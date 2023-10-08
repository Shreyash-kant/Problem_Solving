package Java.Recursion;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        findQueenPos(board, 0, "");
        sc.close();
    }

    static void findQueenPos(int[][] chess, int row, String position) {
        if (row == chess.length) {
            System.out.println("result:" + position);
            return;
        }
        for (int col = 0; col < chess[0].length; ++col) {
            if (isPlacementPossible(chess, row, col)) {
                chess[row][col] = 1;
                findQueenPos(chess, row + 1, position + "(" + row + "," + col + ")-");
                chess[row][col] = 0;
            }
        }
    }

    static boolean isPlacementPossible(int[][] chess, int row, int col) {
        // check for the same column
        for (int i = row - 1, j = col; i >= 0; --i, j = col) {
            if (chess[i][j] == 1)
                return false;
        }
        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; --i, --j) {
            if (chess[i][j] == 1)
                return false;
        }
        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; --i, ++j) {
            if (chess[i][j] == 1)
                return false;
        }
        return true;
    }
}
