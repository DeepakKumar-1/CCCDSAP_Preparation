package MockTestSolutions.MockTest1;

import java.util.Scanner;

public class AlternatingSubarrayPrefix {
    public static void alternateSubArray(int []arr){
        int []ans = new int[arr.length];
        ans[arr.length - 1] = 1;
        for(int i=arr.length -2; i>=0; i--){
            if(arr[i] > 0 && arr[i+1] < 0 || arr[i] < 0 && arr[i+1] > 0){
                ans[i] = ans[i+1]+1;
            }else {
                ans[i] = 1;
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            alternateSubArray(arr);
        }
    }
}
