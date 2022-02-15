package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class MinCostPathMemoization {
    public static int minCostPath(int [][]board){
        int [][]storage = new int[board.length][board[0].length];
        for(int []row : storage) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return minCostPath(board, 0, 0, storage);
    }
    private static int minCostPath(int [][]board, int r, int c, int [][]storage){
        // Boundary Cases
        if(r > board.length-1 || c > board[0].length-1){
            return Integer.MAX_VALUE;
        }

        if(storage[r][c] != Integer.MAX_VALUE){
            return storage[r][c];
        }
        // Base Case
        if(r == board.length-1 && c == board[0].length-1){
            storage[r][c] = board[r][c];
            return storage[r][c];
        }

        int op1 = minCostPath(board, r+1, c, storage);
        int op2 = minCostPath(board, r+1, c+1, storage);
        int op3 = minCostPath(board, r, c+1, storage);
        storage[r][c] = board[r][c] + Math.min(op1, Math.min(op2, op3));
        return storage[r][c];
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
