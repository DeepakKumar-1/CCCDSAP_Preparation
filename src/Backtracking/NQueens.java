package Backtracking;

import java.util.Scanner;

public class NQueens {
    public static void nQueens(int [][]grid, int n){
        nQueens(grid, 0, n);
    }
    private static void nQueens(int [][]grid, int row, int n){
        // Base Case
        if(row == grid.length){
            // Display the Grid
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j] == 0){
                        System.out.print("X ");
                    }else{
                        System.out.print("Q ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // if Place is Safe then Place the Queens
       for(int col=0; col<grid[0].length; col++){
           if(isSafe(grid, row, col)){
               grid[row][col] = 1;
               nQueens(grid, row+1, n-1);
               grid[row][col] = 0;
           }
       }
    }
    private static boolean isSafe(int [][]grid, int row, int col){
        // check Vertical Row
        for(int i=0; i<row; i++){
            if(grid[i][col] == 1){
                return false;
            }
        }
        // Diagonal left
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(grid[row - i][col - i] == 1){
                return false;
            }
        }
        // Diagonal Right
        int maxRight = Math.min(row, grid.length - col - 1);
        for(int i=1; i<=maxRight; i++){
            if(grid[row - i][col + i] == 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [][]grid = new int[m][n];
            nQueens(grid, k);
        }
    }
}
