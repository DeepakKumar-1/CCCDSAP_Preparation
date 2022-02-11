package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumInEachRow {
    public static void maxInEachRow(int [][]matrix){
        for(int i=0; i<matrix.length; i++){
            int max = 0;
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            System.out.print(max + " ");
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
        maxInEachRow(matrix);

    }
}
