package AdvancedRecursion;

import java.util.Scanner;

public class LengthOfString {
    public static int length(String s){
        // Base Case
        if(s.isEmpty()){
            return 0;
        }
        return 1 + length(s.substring(1));
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String s = sc.next();
        int ans = length(s);
        System.out.println("Length of " + s + " is: " + ans);
    }
}
