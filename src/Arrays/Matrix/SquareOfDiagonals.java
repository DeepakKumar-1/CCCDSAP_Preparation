package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfDiagonals {
    public static void squareOfDiagonals(int [][]matrix){
        System.out.print("Diagonal One: ");
        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        System.out.print("Diagonal Two: ");
        for(int i=0; i<matrix.length; i++){
            System.out.print(matrix[i][matrix.length - i - 1] + " ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();
        int [][]matrix = new int[r][c];
        System.out.print("Enter Elements Row Wise: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int []row : matrix){
            System.out.println(Arrays.toString(row));
        }
        squareOfDiagonals(matrix);
    }
}
