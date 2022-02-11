package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CircularRotationMatrix {
    public static boolean isPermutedMatrix(int [][]matrix){
        String s1 = "";
        for(int i=0; i<matrix[0].length; i++){
            s1 += String.valueOf(matrix[0][i]);
        }

        s1 += s1;
        for(int i=1; i<matrix.length; i++){
            String s2 = "";
            for(int j=0; j<matrix[i].length; j++){
                s2 += String.valueOf(matrix[i][j]);
            }
//            System.out.println(s1 +  "  " + s2);
            if(!s1.contains(s2)){
                return false;
            }
        }
        return true;
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

        if(isPermutedMatrix(matrix)){
            System.out.println("Is Permuted Matrix: YES");
        } else {
            System.out.println("Is Permuted Matrix: NO");
        }
    }
}
