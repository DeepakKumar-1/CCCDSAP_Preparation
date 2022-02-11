package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static int [][]matrixMultiplication(int [][]matrixA, int [][]matrixB){
        int [][]matrixC = new int[matrixA.length][matrixB[0].length];
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixB[0].length; j++){
                for(int k=0; k<matrixA[0].length; k++){
                    matrixC[i][j] += (matrixA[i][k] * matrixB[k][j]);
                }
            }
        }
        return matrixC;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();
        int [][]matrixA = new int[r][c];
        System.out.print("Enter Elements Row Wise: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter Number of Rows: ");
        int rB = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int cB = sc.nextInt();
        int [][]matrixB = new int[rB][cB];
        System.out.print("Enter Elements Row Wise: ");
        for(int i=0; i<rB; i++){
            for(int j=0; j<cB; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }

        for(int []row: matrixA){
            System.out.println(Arrays.toString(row));
        }

        for(int []row: matrixB){
            System.out.println(Arrays.toString(row));
        }
        if(matrixA[0].length != matrixB.length){
            System.out.println("Matrix Multiplication is Not Possible");
        } else {
            int[][] ans = matrixMultiplication(matrixA, matrixB);
            System.out.println("Matrix After Multiplication is");

            for (int[] row : ans) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
