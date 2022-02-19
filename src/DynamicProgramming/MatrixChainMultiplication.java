package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixChainMultiplication {
    static final int MOD = 1000000007;
    public static int mcm(int []arr){
        int i = 1;
        int j = arr.length - 1;
        int [][]storage = new int[arr.length][arr.length];
        for(int []row : storage){
            Arrays.fill(row, -1);
        }
        return mcm(arr, storage, i, j);
    }
    private static int mcm(int []arr, int [][]storage, int i, int j){
        // Base case
        if(i == j){
            storage[i][j] = 0;
            return storage[i][j];
        }
        // look up in table
        if(storage[i][j] != -1){
            return storage[i][j];
        }
        storage[i][j] = MOD;
        for(int k = i; k<j; k++){
            storage[i][j] = Math.min(storage[i][j], mcm(arr, storage, i, k) + mcm(arr, storage, k+1, j) + arr[i-1]*arr[k]*arr[j]);
        }
        return storage[i][j];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int ans = mcm(arr);
            System.out.println(ans);
        }
    }
}
