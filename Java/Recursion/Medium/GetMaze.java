package Java.Recursion.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // first cell is considered as 1,1
        ArrayList<String> list = getMazePath(1, 1, n, m);
        System.out.println(list);
    }

    public static ArrayList<String> getMazePath(int srcRow, int srcCol, int desRow, int desCol) {
        if (srcCol == desCol && srcRow == desRow) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        ArrayList<String> horizontalPaths = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();
        if (srcCol < desCol)
            horizontalPaths = getMazePath(srcRow, srcCol + 1, desRow, desCol);
        if (srcRow < desRow)
            verticalPaths = getMazePath(srcRow + 1, srcCol, desRow, desCol);
        ArrayList<String> result = new ArrayList<>();
        for (String h : horizontalPaths) {
            result.add('h' + h);
        }
        for (String v : verticalPaths) {
            result.add('v' + v);
        }
        return result;

    }
}
