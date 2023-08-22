package Java.Recursion.Medium;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation(str);
        sc.close();
    }

    public static void printPermutation(String str) {
        helper(str, "");
    }

    static void helper(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); ++i) {
            String s = new String(str.substring(0, i) + str.substring(i + 1));
            helper(s, result + str.charAt(i));
        }
    }
}
