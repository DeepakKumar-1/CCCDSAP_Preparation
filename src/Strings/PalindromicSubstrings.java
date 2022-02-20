package Strings;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static void solve(String a, String b){
        boolean flag = true;
        for(char ch : a.toCharArray()){
            if(b.contains(ch+"")){
                System.out.println("Yes");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String a = sc.next();
            String b = sc.next();
            solve(a, b);
        }
    }
}
