package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix180DegreeAntiClockWise {
    private static void transpose(int [][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix90(int [][]matrix){
        // Step 1: Transpose the Matrix
        transpose(matrix);
        // Now interchange start Row and end Rows
        int start = 0;
        int end = matrix.length-1;
        while (start <= end) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
            }
            start++;
            end--;
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

        System.out.println("Before Rotation: ");
        for(int []row: matrix){
            System.out.println(Arrays.toString(row));
        }
        rotateMatrix90(matrix);
        rotateMatrix90(matrix);
        System.out.println("After Rotation: ");
        for(int []row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
