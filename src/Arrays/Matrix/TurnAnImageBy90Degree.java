package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class TurnAnImageBy90Degree {
    private static void transpose(char [][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                char temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix90(char [][]matrix){
        // Step 1: Transpose the Matrix
        transpose(matrix);
        // Now interchange start columns and end columns
        int start = 0;
        int end = matrix[0].length-1;
        while (start <= end){
            for(int i=0; i<matrix.length; i++){
                char temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
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
        char [][]matrix = new char[r][c];
        System.out.print("Enter Elements Row Wise: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Before Rotation: ");
        for(char []row: matrix){
            System.out.println(Arrays.toString(row));
        }
        rotateMatrix90(matrix);
        System.out.println("After Rotation: ");
        for(char []row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
