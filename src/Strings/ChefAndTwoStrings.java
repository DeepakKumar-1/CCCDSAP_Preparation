package Strings;

import java.util.Scanner;

public class ChefAndTwoStrings {
    public static void solve(String s1, String s2){
        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();
        int min = 0;
        int max = 0;
        for(int i=0; i<c1.length; i++){
            char ch1 = c1[i];
            char ch2 = c2[i];
            if(ch1 == '?' || ch2 == '?' || ch1 == ch2 ){
                min++;
            }
            if(ch1 == '?' || ch2 == '?' || ch1 != ch2 ){
                max++;
            }
        }
        System.out.println(c1.length - min + " " + max);
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s1 = sc.next();
            String s2 = sc.next();
            solve(s1, s2);
        }
    }
}