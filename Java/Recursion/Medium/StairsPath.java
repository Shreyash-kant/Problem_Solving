package Java.Recursion.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class StairsPath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> myList = getStairsPaths(n);
        System.out.println(myList);
    }

    public static ArrayList<String> getStairsPaths(int n) {
        if (n == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        } else if (n < 0) {
            return new ArrayList<String>();
        }
        ArrayList<String> path1 = getStairsPaths(n - 1);
        ArrayList<String> path2 = getStairsPaths(n - 2);
        ArrayList<String> path3 = getStairsPaths(n - 3);
        ArrayList<String> list = new ArrayList<>();
        for (String s : path1) {
            list.add(1 + s);
        }
        for (String s : path2) {
            list.add(2 + s);
        }
        for (String s : path3) {
            list.add(3 + s);
        }

        return list;

    }
}
