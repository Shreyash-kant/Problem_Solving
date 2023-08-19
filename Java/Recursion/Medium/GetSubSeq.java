package Java.Recursion.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> myList = getSequence(str);
        System.out.println(myList);
    }
    // subsequence is different from substring
    // in subsequence we can ommit some characters in between eg. String:abc
    // Sub-sequence: a, ac, c, b
    // but in substring we cannot ommit any character at all

    // in subsequence we have 2 choices with every character
    // either we can take it or ommit it that is why
    // a string of n chars will have total 2^n sub-sequences, an empty string is
    // subsequence of every string and of itself.

    public static ArrayList<String> getSequence(String str) {
        if (str == "") {
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        ArrayList<String> mylist = new ArrayList<>();
        char a = str.charAt(0);
        ArrayList<String> mylist1 = getSequence(str.substring(1));
        for (int i = 0; i < mylist1.size(); ++i) {
            mylist.add("" + mylist1.get(i));
            mylist.add(a + mylist1.get(i));
        }

        return mylist;
    }
}
