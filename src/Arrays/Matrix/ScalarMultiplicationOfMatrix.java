package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class ScalarMultiplicationOfMatrix {
    public static void scalarMultiplication(int [][]matrix, int k){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] *= k;
            }
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
        System.out.print("Enter Any Scalar Value: ");
        int k = sc.nextInt();
        for(int []row : matrix){
            System.out.println(Arrays.toString(row));
        }
        scalarMultiplication(matrix, k);
        for(int []row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
