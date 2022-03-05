package AdvancedRecursion;

import java.util.Scanner;

public class SubStrings {
    public static void subStrings(String s){
        for(int i=0; i<Math.pow(2, s.length()); i++){
            String str = Integer.toBinaryString(i);
            while (str.length() != s.length()){
                str = '0' + str;
            }
            String res = "";
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '1'){
                    res += s.charAt(j);
                }
            }
            System.out.println(res);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            subStrings(s);
        }
    }
}
