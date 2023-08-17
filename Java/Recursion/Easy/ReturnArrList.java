package Java.Recursion.Easy;

import java.util.ArrayList;

public class ReturnArrList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 3, 53, 5, 3, 5, 3, 9 };
        int target = 3;
        ArrayList<Integer> result = search(arr, 0, target, new ArrayList<Integer>());
        // after the allocation of memory for arraylist the reference
        // value will be passed to recursive function.

        System.out.println(result);

    }

    public static ArrayList<Integer> search(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return search(arr, index + 1, target, list);
        // Every return statement is returning list (in fact the reference value of the
        // actual list is being returned every time)
    }
}
