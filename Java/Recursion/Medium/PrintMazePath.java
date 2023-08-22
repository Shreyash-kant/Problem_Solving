package Java.Recursion.Medium;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // first cell is considered as 1,1
        printMazePath(1, 1, n, m);
        sc.close();
    }

    public static void printMazePath(int sr, int sc, int desRow, int desCol) {
        helper(sr, sc, desRow, desCol, "");
    }

    static void helper(int sr, int sc, int desRow, int desCol, String result) {
        // this is smart call and normal base case in recursion
        if (sr == desRow && sc == desCol) {
            System.out.println(result);
            return;
        }
        if (sc < desCol)
            helper(sr, sc + 1, desRow, desCol, result + 'h');
        if (sr < desRow)
            helper(sr + 1, sc, desRow, desCol, result + "v");
        // this is stupid call and smart base case (smart: the place where you are
        // handling possible out-of-bound conditions)
        // if (sr > desRow || sc > desCol)
        // return;

        // if (sr == desRow && sc == desCol) {
        // System.out.println(result);
        // return;
        // }
        // helper(sr, sc + 1, desRow, desCol, result + 'h');
        // helper(sr + 1, sc, desRow, desCol, result + "v");
    }
}
