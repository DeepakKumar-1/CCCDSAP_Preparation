package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortAGivenMatrix {
    public static void sort(int [][]matrix){
        for(int []row : matrix){
            Arrays.sort(row);
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
        for(int []row: matrix){
            System.out.println(Arrays.toString(row));
        }
        sort(matrix);
        System.out.println("After Sorting: ");
        for(int []row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
