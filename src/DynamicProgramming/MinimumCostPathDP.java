package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostPathDP {
    public static int minCostPath(int [][]board){
        int m = board.length;
        int n = board[0].length;
        int [][]storage = new int[board.length][board[0].length];
        // Base case
        storage[m-1][n-1] = board[m-1][n-1];
        // Last Row
        for(int j = n-2; j >= 0; j--){
            storage[m-1][j] = storage[m-1][j+1] + board[m-1][j];
        }
        // Last Column
        for(int i = m-2; i >= 0; i--){
            storage[i][n-1] = storage[i+1][n-1] + board[i][n-1];
        }
        for(int i= m-2; i >= 0 ; i--){
            for(int j = n-2; j >= 0; j--){
                storage[i][j] = board[i][j] + Math.min(storage[i][j+1], Math.min(storage[i+1][j+1], storage[i+1][j]));
            }
        }
        return storage[0][0];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int [][]board = new int[r][c];
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    board[i][j] = sc.nextInt();
                }
            }
            System.out.println(minCostPath(board));
        }
    }
}
