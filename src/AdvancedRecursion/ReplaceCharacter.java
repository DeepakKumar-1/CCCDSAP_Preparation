package AdvancedRecursion;

import java.util.Scanner;

public class ReplaceCharacter {
    public static String replace(String up, String p, char a, char b){
        // Base case
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if(ch == a){
            return replace(up.substring(1), p+b, a, b);
        }
        return replace(up.substring(1), p+ch, a, b);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            System.out.print("Enter Any String: ");
            String s = sc.next();
            String ans = replace(s, "", 'a', 'b');
            System.out.println("ANS: " + ans);
        }
    }
}
