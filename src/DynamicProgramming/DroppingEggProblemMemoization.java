package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class DroppingEggProblemMemoization {
    public static int eggsDropping(int n, int k){
        int [][]storage = new int[n][k];
        for(int []row: storage){
            Arrays.fill(row, -1);
        }
        return eggsDropping(n, k, storage);
    }
    private static int eggsDropping(int n, int k, int [][]storage){
        if(storage[n][k] != -1){
            return storage[n][k];
        }
        // Base Case
        if(n == 1 || k == 0){
            storage[n][k] = n;
            return storage[n][k];
        }
        // if We have one Egg then Then We Need n floors for trials
        if(n == 1){
            storage[n][k] = 1;
            return storage[n][k];
        }
        // Consider All Floors from 1 to n
        int min = Integer.MAX_VALUE;
        for(int x=1; x<=k; x++){
            int ans = Math.max(eggsDropping(n-1, x - 1), eggsDropping(n, k - x));
            if(min > ans){
                min = ans;
            }
        }
        storage[n][k] = 1+min;
        return storage[n][k];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            // Take Number of Eggs
            int n = sc.nextInt();
            // Take Number of Floors
            int k = sc.nextInt();
            int ans = eggsDropping(n, k);
            System.out.println(ans);
        }
    }
}

