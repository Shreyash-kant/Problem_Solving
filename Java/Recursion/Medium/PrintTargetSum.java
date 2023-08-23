package Java.Recursion.Medium;

import java.util.Scanner;

public class PrintTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target:");
        int target = sc.nextInt();
        printTarget(arr, target);
        sc.close();
    }

    public static void printTarget(int[] arr, int target) {
        helper(arr, 0, "", 0, target);
    }

    static void helper(int[] arr, int index, String path, int sum, int target) {
        if (index == arr.length) {
            if (sum == target) {
                System.out.println(path);
                return;
            } else
                return;
        } else if (sum > target)
            return;
        helper(arr, index + 1, path + arr[index], sum + arr[index], target);
        helper(arr, index + 1, path, sum, target);
    }
}
