package Java.Recursion.Easy;

import java.util.ArrayList;

public class FindAllIndex {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 3, 53, 5, 3, 5, 3, 9 };
        int target = 5;
        search(arr, 0, target);

        System.out.println(list);

    }

    public static void search(int[] arr, int index, int target) {
        if (index == arr.length)
            return;
        if (arr[index] == target)
            list.add(index);
        search(arr, index + 1, target);
    }
}
