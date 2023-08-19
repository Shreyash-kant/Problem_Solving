package Java.Recursion.Easy;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 5, 3, 53, 5, 3, 5, 3, 9 };
        int target = 10;
        System.out.println(search(arr, 0, target));
    }

    public static int search(int[] arr, int index, int target) {
        if (arr.length == index)
            return -1;
        int lastindex = search(arr, index + 1, target);
        if (lastindex == -1)
            if (arr[index] == target)
                lastindex = index;
        return lastindex;
    }
}
