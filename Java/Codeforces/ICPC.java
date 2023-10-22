package Java.Codeforces;

import java.util.Scanner;

public class ICPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases-->0){
            int sizeOfString = sc.nextInt();
            String problems = sc.next();
            helper(problems,sizeOfString);
        }
        sc.close();
    }
    static  void helper(String problems, int sizeOfString){
        int[] arr = new int[26];
        for(int i =0;i<sizeOfString;++i){
            int index = problems.charAt(i)-'A';
            if(arr[index]==0)
                arr[index]+=2;
            else arr[index]++;
        }
        int balloons=0;
        for(int i=0;i<arr.length;++i){
            balloons+=arr[i];
        }
        System.out.println(balloons);
    }
}
