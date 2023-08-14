package Java.Recursion.Easy;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(printDigitSum(num));
        sc.close();
    }

    static int printDigitSum(int num) {
        if (num == 0)
            return 0;
        int sum = num % 10;
        int restSum = printDigitSum(num / 10);
        return sum + restSum;
        // or
        // return num%10+printDigitSum(num/10);

    }
}
