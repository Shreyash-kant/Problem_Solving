package Java.Recursion.Easy;

import java.util.Scanner;

public class CountZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("zeros:" + zeroCount(num, 0));
        sc.close();
    }

    public static int zeroCount(int num, int zeros) {
        if (num == 0)
            return zeros;
        if (num % 10 == 0)
            return zeroCount(num / 10, zeros + 1);
        else
            return zeroCount(num / 10, zeros);
    }

}
