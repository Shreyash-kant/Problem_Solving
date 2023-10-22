package Java.Codeforces;

import java.util.Scanner;

public class BorG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        int len = s.length();
        for(int i=0;i<len;++i){
            if(arr[s.charAt(i)-'a']==0){
                arr[s.charAt(i)-'a']=1;
            }
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
