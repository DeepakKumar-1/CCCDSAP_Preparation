package Arrays.Matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueElementsInMatrix {
    public static void matrixUnique(int [][]matrix){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(map.containsKey(matrix[i][j])){
                    map.put(matrix[i][j] , map.get(matrix[i][j]) +  1);
                } else{
                    map.put(matrix[i][j] , 1);
                }
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key + " ");
            }
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
        matrixUnique(matrix);
    }
}
