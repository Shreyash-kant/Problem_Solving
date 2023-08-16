package Java.Recursion.Easy;

import java.util.Scanner;

public class ReverseN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("reversed:" + reverse(num));
    }

    public static int reverse(int num) {
        int digits = (int) (Math.log10(num) + 1);
        return helper(num, digits);
    }

    public static int helper(int num, int digits) {
        if (num % 10 == num)
            return num;
        int remainder = num % 10;
        int raiseto = remainder * (int) Math.pow(10, digits - 1);
        return raiseto + helper(num / 10, digits - 1);
    }
}