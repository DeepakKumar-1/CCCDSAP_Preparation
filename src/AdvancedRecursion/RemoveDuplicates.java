package AdvancedRecursion;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicate(String up, String p){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if(!p.contains(ch+"")){
            return removeDuplicate(up.substring(1), p+ch);
        }
        return removeDuplicate(up.substring(1), p);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String s = sc.next();
        String ans = removeDuplicate(s, "");
        System.out.println("Ans: " + ans);
    }
}
