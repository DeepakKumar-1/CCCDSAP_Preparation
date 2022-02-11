package Arrays.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumberOf1s {
    public static int maxNumberOf1s(int [][]matrix){
        int maxIndex = 0;
        int max = 0;
        int index = -1;
        for(int []row : matrix){
            index++;
            int count = 0;
            for(int ele : row){
                if(ele == 1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                maxIndex = index;
            }
        }
        return maxIndex;
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
       int ans = maxNumberOf1s(matrix);
        System.out.println("Max 1s are in row no: " + ans);
    }
}
