package Java.Recursion.Easy;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
        sc.close();
    }

    static int fibo(int n) {
        // this is a normal recursive function to get nth fibonacci number
        // and this not efficient because it will calculate fibonacci numbers in right
        // recursive call that has already been calculated
        // in left recursive call.
        if (n == 0 || n == 1)
            return n;
        int left = fibo(n - 1);
        int right = fibo(n - 2);
        return left + right;
    }
}
