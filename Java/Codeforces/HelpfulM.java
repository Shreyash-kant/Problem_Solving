package Java.Codeforces;

import java.util.Scanner;

public class HelpfulM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();

        int[] arr = new int[3];
        for(int i=0;i<len;++i){
            if(input.charAt(i)!='+'){
                arr[(input.charAt(i)-'0')-1]++;
            }
        }
        String result = "";
        while(arr[0]-->0){
            result+="1+";
        }
        while(arr[1]-->0){
            result+="2+";
        }
        while(arr[2]-->0){
            result+="3+";
        }
        System.out.println(result.substring(0,result.length()-1));
        sc.close();
    }

}
