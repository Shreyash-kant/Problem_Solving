package Java.Recursion.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 3, 32, 4, 2, 20 };
        int target = 20;
        System.out.println("index:" + search(arr, 0, target));
    }

    public static int search(int[] arr, int indx, int target) {
        if (indx == arr.length)
            return -1;
        if (arr[indx] == target)
            return indx;
        return search(arr, indx + 1, target);
    }
}