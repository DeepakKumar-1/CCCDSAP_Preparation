package Strings;

import java.util.Scanner;

public class ChefAndDigitsOfANumber {
    public static void solve(String n){
        int count1 = 0;
        int count0 = 0;
        for(char ch: n.toCharArray()){
            if(ch == '0'){
                count0++;
            }else{
                count1++;
            }
        }
        if(count0 == 1 || count1 == 1){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String n = sc.next();
            solve(n);
        }
    }
}
