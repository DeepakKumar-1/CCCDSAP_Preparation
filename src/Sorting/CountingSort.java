package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int []arr){
        int []ans = new int[arr.length];
        // Find Maximum in arr
        int max = maximum(arr);
        // Maintain count Array
        int []count = new int[10];
        // iterate over arr and Store Count of Element in count Array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // Now Maintain Sum
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        // iterate over count Array and Decrement the corresponding count as in arr
        for(int i=0; i<arr.length; i++){
            ans[count[arr[i]] - 1] = arr[i];
//            System.out.println(count[arr[i]]);
            count[arr[i]] -= 1;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ans[i];
        }
    }

    public static int maximum(int []arr){
        int max = 0;
        for(int element : arr){
            max = Math.max(element, max);
        }
        return max;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        // Create an Array of size n
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Before Sorting is: " + Arrays.toString(arr));
        countingSort(arr);
        // Array After Sorting
        System.out.print("Array After Sorting is: " + Arrays.toString(arr));
    }
}
