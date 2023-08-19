package Java.Recursion.Medium;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("Print tower of Hanoi instructions for given number of disks");
        int n = 3;
        towerOfH(n);
    }

    public static void towerOfH(int n) {
        helper(n, 'A', 'B', 'C');
    }

    public static void helper(int n, char A, char B, char C) {
        if (n == 0)
            return;
        helper(n - 1, A, C, B);
        System.out.printf("Move %d [%c->%c]\n", n, A, B);
        helper(n - 1, C, B, A);
    }
    // OutPut
    // Print tower of Hanoi instructions for given number of disks
    // Move 1 [A->B]
    // Move 2 [A->C]
    // Move 1 [B->C]
    // Move 3 [A->B]
    // Move 1 [C->A]
    // Move 2 [C->B]
    // Move 1 [A->B]
}
