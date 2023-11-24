package Java.Sorting;
//import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5,3,22,5,6,3,2,1,5,534,20};
        sorting(arr,arr.length);

    }
    //in the best case, time complexity is O(n):
    // No swapping will take place.
    // Elements are already sorted.

    //in the worst case, ... O(n^2):
    //Swapping on every iteration.
    //Elements are arranged in decreasing order.
    static void sorting(int[] arr, int n){
        for(int i=0;i<n-1;++i){
            for(int j=0;j<n-1-i;++j){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display(arr);
    }
    static void display(int[] arr){
        for (int j : arr) System.out.print(j + " ");
    }
}
