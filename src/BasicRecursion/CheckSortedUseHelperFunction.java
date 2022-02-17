package BasicRecursion;

import java.util.Scanner;

public class CheckSortedUseHelperFunction {
    private static boolean isSorted(int []arr, int startIndex){
        if(startIndex >= arr.length - 1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        return isSorted(arr, startIndex+1);
    }
    public static boolean isSorted(int []arr){
        return isSorted(arr, 0);
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
            boolean ans = isSorted(arr);
            System.out.println(ans);
        }
    }
}
