package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndSecretIngredients {
    public static void solve(String []dishes){
        Set<Character> set = new HashSet<>();
        for(char ch: dishes[0].toCharArray()){
            set.add(ch);
        }
        for(int i=1; i<dishes.length; i++){
            Set<Character> s = new HashSet<>();
            for(char c: dishes[i].toCharArray()){
                s.add(c);
            }
            set.retainAll(s);
        }
        System.out.println(set.size());
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            String []dishes = new String[n];
            for(int i=0; i<n; i++){
                dishes[i] = sc.next();
            }
            solve(dishes);
        }
    }
}
