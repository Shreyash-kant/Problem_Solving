package Java.Sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {-5, 3, 0, -2, 8, -1};
        sorting(arr,arr.length);
    }
    static void sorting(int[] arr, int n){
        for(int i=0;i<n-1;++i){
            int minIndex = i;
            for(int j=i+1;j<n;++j){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        display(arr);
    }
    static void display(int[] arr){
        for (int j : arr) System.out.print(j + " ");
    }
}
