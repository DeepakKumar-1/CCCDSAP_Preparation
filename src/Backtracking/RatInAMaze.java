package Backtracking;

import java.util.Scanner;

public class RatInAMaze {
    public static void ratInAMaze(boolean [][]grid){
        ratInAMaze(grid, 0, 0, "");
    }
    private static void ratInAMaze(boolean [][]grid, int row, int col, String path){
        // Base Case
        // When we r at Last Cell in the Grid
        if(row == grid.length-1 && col == grid[0].length-1){
            // We Have got one Path
            // Print that Path
            System.out.println(path);
            return;
        }
        // Edge Cases
        if( row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || !grid[row][col]){
            return;
        }
        // Mark the Current Position as Visited i.e False
        grid[row][col] = false;
        // Go Up
        ratInAMaze(grid, row-1, col, path+'U');
        // Go Down
        ratInAMaze(grid, row+1, col, path+'D');
        // Go Left
        ratInAMaze(grid, row, col-1, path+'L');
        // Go Right
        ratInAMaze(grid, row, col+1, path+'R');
        // Revert the Changes
        grid[row][col] = true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            // Take Size of the Grid
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean [][]grid = new boolean[m][n];
            for(int i=0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    int k = sc.nextInt();
                    if(k == 0){
                        grid[i][j] = false;
                    } else {
                        grid[i][j] = true;
                    }
                }
            }
            ratInAMaze(grid);
        }
    }
}
