package BasicRecursion;

import java.util.Scanner;

public class CheckSorted2 {
    public static boolean checkSorted(int []arr){
        // Base Case
        if(arr.length <= 1){
            return true;
        }

        if(arr[0] > arr[1]){
            return false;
        }

        int []a = new int[arr.length - 1];
        for(int i=1; i<arr.length; i++){
            a[i-1] = arr[i];
        }

        return checkSorted(a);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(checkSorted(arr));
        }
    }
}
