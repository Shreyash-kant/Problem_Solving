package Java.Recursion.Easy;

import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubSeq(str);
    }

    public static void printSubSeq(String str) {
        helper(str, "");
    }

    static void helper(String actual, String result) {
        if (actual == "") {
            System.out.println(result);
            return;
        }
        char ch = actual.charAt(0);
        helper(actual.substring(1), result + ch);
        helper(actual.substring(1), result + "");

    }
}
