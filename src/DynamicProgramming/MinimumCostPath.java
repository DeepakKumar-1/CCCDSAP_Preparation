package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostPath {
    public static int minCostPath(int [][]board){
        return minCostPath(board, 0, 0);
    }
    private static int minCostPath(int [][]board, int r, int c){
        // Base Case
        if(r == board.length-1 && c == board[0].length-1){
            return board[r][c];
        }
        if(r > board.length-1 || c > board[0].length-1){
            return Integer.MAX_VALUE;
        }
        int op1 = minCostPath(board, r+1, c);
        int op2 = minCostPath(board, r+1, c+1);
        int op3 = minCostPath(board, r, c+1);
        return board[r][c] + Math.min(op1, Math.min(op2, op3));
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
