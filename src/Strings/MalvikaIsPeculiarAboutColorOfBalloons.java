package Strings;

import java.util.Scanner;

public class MalvikaIsPeculiarAboutColorOfBalloons {
    public static void solve(String s){
        int counta = 0;
        int countb = 0;
        for(char ch: s.toCharArray()){
            if(ch == 'a'){
                counta++;
            } else{
                countb++;
            }
        }

        if(counta ==0 || countb == 0){
            System.out.println(0);
        } else {
            if(counta > countb){
                System.out.println(countb);
            } else {
                System.out.println(counta);
            }
        }
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
