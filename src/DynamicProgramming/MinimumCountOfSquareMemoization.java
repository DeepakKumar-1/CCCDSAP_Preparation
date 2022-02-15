package DynamicProgramming;

import java.util.Scanner;

public class MinimumCountOfSquareMemoization {
    public static int minCountOfSquare(int n){
        int []storage = new int[n+1];
        return minCountOfSquare(n, storage);
    }
    public static int minCountOfSquare(int n, int []storage){
        if(storage[n] != 0){
            return storage[n];
        }
        // Base Case
        if(n == 1){
            storage[n] = 1;
            return storage[n];
        }
        int minCount = n;
        for(int i=1; i<=Math.sqrt(n); i++){
            int op = 1 + minCountOfSquare(n - i*i, storage);
            if(op < minCount){
                minCount = op;
            }
        }
        storage[n] = minCount;
        return storage[n];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            System.out.println("Minimum Count Of Square: " + minCountOfSquare(n));
        }
    }
}
