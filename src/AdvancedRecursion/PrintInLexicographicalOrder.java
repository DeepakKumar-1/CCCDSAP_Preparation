package AdvancedRecursion;

import java.util.Scanner;

public class PrintInLexicographicalOrder {
    public static void dfs(int i, int n){
        // base case
        if(i > n){
            return;
        }
        System.out.println(i);
        for(int j=0; j < 10; j++){
            dfs(i*10 + j, n);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            for(int i=1; i<=9; i++){
                dfs(i, n);
            }
        }
    }
}
