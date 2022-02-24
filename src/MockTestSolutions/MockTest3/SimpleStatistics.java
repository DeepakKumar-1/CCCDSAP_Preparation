package MockTestSolutions.MockTest3;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SimpleStatics
{
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

            Arrays.sort(arr);
            // remove first k and last k Elemenets
            int i = 0;
            int j = arr.length - 1;
            i = i+k;
            j = j-k;
            double sum = 0;
            double count = 0;
            for(int m = i; m<=j; m++){
                count++;
                sum += arr[m];
            }
            System.out.println(sum / count);

        }
    }
}