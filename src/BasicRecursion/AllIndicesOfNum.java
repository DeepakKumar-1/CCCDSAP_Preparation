package BasicRecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndicesOfNum {
    public static ArrayList<Integer> allIndices(int []arr, int num, int startIndex, ArrayList<Integer>list){
        if(startIndex == arr.length){
            return list;
        }
        if(arr[startIndex] == num){
            list.add(startIndex);
        }
        return allIndices(arr, num, startIndex+1, list);
    }
    public static ArrayList<Integer> allIndices(int []arr, int num){
        return allIndices(arr, num, 0, new ArrayList<Integer>());
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int num = sc.nextInt();
            System.out.println(allIndices(arr, num));
        }
    }
}
