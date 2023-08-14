package Java.Recursion.Easy;

import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number!");
        int num = sc.nextInt();
        System.out.println(printDigitProduct(num));
    }

    static int printDigitProduct(int num) {
        if (num == 0)
            return 1;
        int sum = num % 10;
        int restSum = printDigitProduct(num / 10);
        return sum * restSum;
        // or
        // return num%10 * printDigitSum(num/10);
    }
}
