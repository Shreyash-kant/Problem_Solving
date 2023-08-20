package Java.Recursion.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    static String[] keypad = { "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".;" };

    static ArrayList<String> getKeywordCombination(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = str.charAt(0);
        ArrayList<String> list1 = getKeywordCombination(str.substring(1));

        String code = keypad[ch - '0'];
        for (int i = 0; i < code.length(); ++i) {
            for (String s : list1) {
                list.add(code.charAt(i) + s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> mylist = getKeywordCombination(str);
        System.out.println(mylist);
    }
}
