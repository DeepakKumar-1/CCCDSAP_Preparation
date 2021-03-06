package AdvancedRecursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhoneKeypadProblem {
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
    public static ArrayList<String> keyPad(String digit, String p, ArrayList<String> list, int index){
        if(digit.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            return l;
        }
        if(index >= digit.length()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        int num = digit.charAt(index) - '0';
        String str = getString(num);
        for(int i=0; i<str.length(); i++){
            list.addAll(keyPad(digit, p+str.charAt(i), list, index+1));
        }
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String digit = sc.next();
            System.out.println(keyPad(digit, "", new ArrayList<>(), 0));
        }
    }
}
