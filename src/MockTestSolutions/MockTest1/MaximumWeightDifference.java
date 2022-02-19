package MockTestSolutions.MockTest1;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumWeightDifference {
    public static void weight(int []arr, int k){
        int n = arr.length;
        Arrays.sort(arr);
        if(k <= n/2){
            int sum1 = 0;
            for(int i=0; i<k; i++){
                sum1 += arr[i];
            }
            int sum2 = 0;
            for(int i=k; i<arr.length; i++){
                sum2 += arr[i];
            }
            System.out.println(Math.abs(sum2 - sum1));
        }
        else{
            int sum1 = 0;
            for(int i=arr.length-1; i>=n-k; i--){
                sum1 += arr[i];
            }
            int sum2 = 0;
            for(int i=n-k-1; i>=0; i--){
                sum2 += arr[i];
            }
            System.out.println(Math.abs(sum1- sum2));
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            weight(arr, k);
        }
    }
}
