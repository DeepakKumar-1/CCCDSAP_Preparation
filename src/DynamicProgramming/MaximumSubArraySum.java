package DynamicProgramming;

import java.util.Scanner;

public class MaximumSubArraySum {
    private static int maxSubArraySum(int []arr){
        int []storage = new int[arr.length];
        storage[0] = (arr[0]>0) ? arr[0] : 0;
        int maxSoFar = storage[0];
        for(int i=1; i<arr.length;i++){
            storage[i] = storage[i-1] + arr[i];
            if(storage[i] < 0){
                storage[i] = 0;
            }
            maxSoFar = Math.max(storage[i], maxSoFar);
        }
        return maxSoFar;
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
            int ans = maxSubArraySum(arr);
            System.out.println(ans);
        }
    }
}
