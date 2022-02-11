package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayLowerAndUpperTriangularMatrix {
    public static void lowerTriangular(int [][]matrix){
        int [][]lowerTriMatrix = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<=i; j++){
                lowerTriMatrix[i][j] = matrix[i][j];
            }
        }
        for(int []row : lowerTriMatrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void upperTriangular(int [][]matrix){
        int [][]upperTriMatrix = new int[matrix.length][matrix[0].length];
        for(int i=matrix.length-1; i>=0; i--){
            for(int j=matrix[0].length-1; j >= i; j--){
                upperTriMatrix[i][j] = matrix[i][j];
            }
        }
        for(int []row : upperTriMatrix){
            System.out.println(Arrays.toString(row));
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
        System.out.println("Lower Triangular Matrix is");
        lowerTriangular(matrix);
        System.out.println("Upper Triangular Matrix is");
        upperTriangular(matrix);

    }
}
