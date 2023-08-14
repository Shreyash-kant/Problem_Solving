package Java.Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        int num = 5;
        printN(num);
    }

    static void printN(int n) {
        if (n == 0)
            return;
        System.out.println(n + " ");
        printN(n - 1);
    }

}
