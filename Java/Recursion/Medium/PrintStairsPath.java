package Java.Recursion.Medium;

import java.util.Scanner;

public class PrintStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many stairs are there?");
        int n = sc.nextInt();
        printStairs(n);
        sc.close();
    }

    public static void printStairs(int n) {
        // max jumps 1 2 or 3
        helper(n, "");
    }

    static void helper(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        } else if (n < 0)
            return;
        // for (int i = 1; i < 4; ++i) {
        // helper(n - i, path + i);
        // }
        helper(n - 1, path + '1');
        helper(n - 2, path + '2');
        helper(n - 3, path + '3');
    }
}
