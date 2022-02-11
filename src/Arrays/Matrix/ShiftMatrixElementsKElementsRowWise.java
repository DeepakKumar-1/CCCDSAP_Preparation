package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftMatrixElementsKElementsRowWise {
    public static void shiftKElements(int [][]matrix, int k){
        if(k > matrix.length){
            return;
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=k; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            for(int l=0; l<k; l++){
                System.out.print(matrix[i][l] + " ");
            }
            System.out.println();
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
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        for(int []row : matrix){
            System.out.println(Arrays.toString(row));
        }
        shiftKElements(matrix, k);
    }
}
