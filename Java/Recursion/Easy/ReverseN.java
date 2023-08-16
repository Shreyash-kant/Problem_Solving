package Java.Recursion.Easy;

import java.util.Scanner;

public class ReverseN {
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
        System.out.println("reversed:" + result);
    }

    static void reverse(int num) {
        if (num == 0)
            return;
        result = result * 10 + num % 10;
        reverse(num / 10);
    }
}
