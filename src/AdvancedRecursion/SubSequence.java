package AdvancedRecursion;

import java.util.Scanner;

public class SubSequence {
    public static void subSequence(String s, String p){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        // take it
        subSequence(s.substring(1), p+ch);
        // reject it
        subSequence(s.substring(1), p);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            subSequence(s, "");
        }
    }
}
