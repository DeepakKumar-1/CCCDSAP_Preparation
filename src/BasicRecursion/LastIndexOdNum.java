package BasicRecursion;

import java.util.Scanner;

public class LastIndexOdNum {
    private static int lastIndex(int []arr, int startIndex, int num){
        if(startIndex == -1){
            return -1;
        }
        if(arr[startIndex] == num){
            return startIndex;
        }
        return lastIndex(arr, startIndex-1, num);
    }
    public static int lastIndex(int []arr, int num){
        return lastIndex(arr, arr.length-1, num);
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
            System.out.println(lastIndex(arr, num));
        }
    }
}
