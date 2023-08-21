package Java.Recursion.Medium;

import java.util.Scanner;

public class PrintKPC {
    static String[] keypad = { "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".;" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the pressed key-combination!");
        String str = sc.next();
        printKPC(str);
        sc.close();
    }

    public static void printKPC(String str) {
        helper(str, "");
    }

    static void helper(String actual, String ans) {
        if (actual == "") {
            System.out.println(ans);
            return;
        }
        // actual: 789
        char ch = actual.charAt(0);
        String restStr = actual.substring(1);// 89
        String keyCode = keypad[ch - '0'];// uv
        for (int i = 0; i < keyCode.length(); ++i) {
            helper(restStr, ans + keyCode.charAt(i));
        }

    }
}
