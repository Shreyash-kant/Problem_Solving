package Java.Recursion.DP;

import java.util.Scanner;

public class FibonacciDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        System.out.println(fibo(n, dp));
        sc.close();
    }

    static int fibo(int n, int[] dp) {
        if (n == 0 || n == 1)
            return n;
        if (dp[n] != 0)
            return dp[n];
        int left = fibo(n - 1, dp);
        int right = fibo(n - 2, dp);
        dp[n] = left + right;
        return left + right;
    }
}
