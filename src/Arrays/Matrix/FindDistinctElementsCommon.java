package Arrays.Matrix;
import java.util.*;

public class FindDistinctElementsCommon {
    public static void findDistinct(int [][]matrix){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<matrix[0].length; i++){
            if(!map.containsKey(matrix[0][i])){
                map.put(matrix[0][i], 1);
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(map.containsKey(matrix[i][j]) && map.get(matrix[i][j]) == i){
                    map.put(matrix[i][j], map.get(matrix[i][j]) + 1);
                }
            }
        }
        // Now print all the distinct Element
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<matrix[0].length; i++){
            set.add(matrix[0][i]);
        }
        for(int i : set){
//            System.out.println(map.get(matrix[0][i]));
            if(map.get(i) == matrix.length){
                System.out.print(i  + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat =  {{12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35},
                {14, 1, 14, 3, 11},
                {14, 5, 3, 2, 1},
                {1, 18, 3, 21, 14}};
        findDistinct(mat);
    }
}
