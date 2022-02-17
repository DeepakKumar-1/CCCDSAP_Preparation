package BasicRecursion;

import java.util.Scanner;

public class SumOfArray {
    static int sum(int []arr, int startIndex){
        if(startIndex == arr.length){
            return 0;
        }
        return arr[startIndex] + sum(arr, startIndex+1);
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
            int ans = sum(arr, 0);
            System.out.println(ans);
        }
    }
}
