package Java.Recursion.DP;

import java.util.Scanner;

public class NoOfStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(noOfPaths(n, new int[n + 1]));
        sc.close();
    }

    static int noOfPaths(int n, int[] dp) {
        // steps allowed 1, 2 or 3
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;
        // this is memoization method for climbing stairs paths
        else if (dp[n] != 0)
            return dp[n];
        int one = noOfPaths(n - 1, dp);
        int two = noOfPaths(n - 2, dp);
        int three = noOfPaths(n - 3, dp);
        dp[n] = one + two + three;
        return dp[n];
    }
}
