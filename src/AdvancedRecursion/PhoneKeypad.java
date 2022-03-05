package AdvancedRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneKeypad {
    public static String getString(int d){
        return switch (d) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> "";
        };
    }
    public static ArrayList<String> keypad(String digits, String ans, int index, ArrayList<String> list){
        // Base Case
        if(index >= digits.length()){
            ArrayList<String> l = new ArrayList<>();
            if(list.contains(ans)) {
                return new ArrayList<>();
            }
            l.add(ans);
            return l;
        }
        int num = digits.charAt(index) - '0';
        String str = getString(num);
        for(int i=0; i<str.length(); i++){
            list.addAll(keypad(digits, ans+str.charAt(i), index+1, list));
        }
        return list;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String digits = sc.next();
            System.out.println(keypad(digits, "", 0, new ArrayList<>()));
        }
    }
}
