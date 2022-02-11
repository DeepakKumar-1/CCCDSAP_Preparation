package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSpiralPrintInCounterClockWise {
    public static void spiralPrint(int [][]matrix){
        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int dir = 0;
        /*
        Directions
           1 - top to Bottom
           2 - left to right
           3 - Bottom tu up
           4 - right to left
         */
        while(top <= down && left <= right){
            if(dir == 0){
                for(int i=top; i<=down; i++){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            } else if(dir == 1){
                for(int i=left; i<=right; i++){
                    System.out.print(matrix[down][i] + " ");
                }
                down--;
            }   else if(dir == 2){
                for(int i=down; i>=top; i--){
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            } else if(dir == 3){
                for(int i=right; i>=left; i--){
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
            }
            dir = (dir + 1) % 4;
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
        spiralPrint(matrix);
    }
}
