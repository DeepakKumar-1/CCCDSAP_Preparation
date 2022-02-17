package BasicRecursion;

import java.util.Scanner;

public class FirstIndexOfNum {
    private static int firstIndex(int []arr, int startIndex, int num){
        if(startIndex == arr.length){
            return -1;
        }
        if(arr[startIndex] == num){
            return startIndex;
        }
        return firstIndex(arr, startIndex+1, num);
    }
    public static int firstIndex(int []arr, int num){
        return firstIndex(arr, 0, num);
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
            System.out.println(firstIndex(arr, num));
        }
    }
}
