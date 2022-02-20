package Strings;

import java.util.Scanner;

public class ProcessingAString {
    public static void solve(String s){
        int sum = 0;
        for(char ch : s.toCharArray()){
            int x = ch - '0';
            if(x >= 0 && x<10){
                sum += x;
            }
        }
        System.out.println(sum);
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            solve(s);
        }
    }
}