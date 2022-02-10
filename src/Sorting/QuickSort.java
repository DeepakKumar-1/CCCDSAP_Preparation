package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static int partition(int []arr, int start, int end){
        int pivot = arr[start];
        int low = start+1;
        int high = end;
        do{
            while (arr[low] <= pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            // Swap high and low
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        } while (low < high);
        // swap pivot and arr[high]
        int temp = arr[start];
        arr[start] = arr[high];
        arr[high] = temp;
        return high;
    }
    public static void quickSort(int []arr, int start, int end){
        if(start < end){
            // Find the Partition Index
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
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
        quickSort(arr, 0, arr.length-1);
        // Array After Sorting
        System.out.print("Array After Sorting is: " + Arrays.toString(arr));
    }
}
