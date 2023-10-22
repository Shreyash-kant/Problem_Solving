package Java.Codeforces;

import java.util.Scanner;

public class Stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inp = sc.next();
        if(n==1) System.out.print(0);
        else{
            int i=1;
            int count=0;
            while(i<n){
                if(inp.charAt(i)==inp.charAt(i-1))count++;
                ++i;
            }
            System.out.print(count);
        }
    }
}
