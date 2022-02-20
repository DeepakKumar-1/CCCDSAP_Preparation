package Strings;

import java.util.Scanner;

public class SnakeProcession {
    public static void snakeProcession(int n, String str){
        String s = "";
        for(char ch: str.toCharArray()){
            if(ch != '.'){
                s += ch;
            }
        }
        boolean flag = true;
        if(s.length() == 0){
            System.out.println("Valid");
            flag = false;
        } else if(s.length()%2 == 1){
            System.out.println("Invalid");
            flag = false;
        } else {
            // H must be there at Every Even Position
            // and T must be there at Every Odd Position
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(i%2 == 0 && ch == 'T'){
                    System.out.println("Invalid");
                    flag = false;
                    break;
                } else if(i % 2 == 1 && ch == 'H'){
                    System.out.println("Invalid");
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Valid");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            snakeProcession(n, str);
        }
    }
}

/*
            6
            18
            ..H..T...HTH....T.
            3
            ...
            10
            H..H..T..T
            2
            HT
            11
            .T...H..H.T
            7
            H..T..
            HValid
            Valid
            Invalid
            Valid
            Invalid
            Invalid
 */