package Strings;

import java.util.Scanner;

public class PawriMeme {
    public static void solve(String s){
        if(!s.contains("party")){
            System.out.println(s);
        } else{
            // Change pawri to party
            String s1 = s.replaceAll("party", "pawri");
            System.out.println(s1);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            solve(s);
        }
    }
}
