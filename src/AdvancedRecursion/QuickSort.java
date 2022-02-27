package AdvancedRecursion;

import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int []arr, int start, int end){
        if(start < end){
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start+1;
        int j = end;
        while (i < j){
            while (i<j && arr[i] <= pivot) {
                i++;
            }
            while (i<j && arr[j] > pivot) {
                j--;
            }
            // swap
            if(i < j) {
//                arr[i] = arr[i] ^ arr[j];
//                arr[j] = arr[i] ^ arr[j];
//                arr[i] = arr[i] ^ arr[j];
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap  j with pivot
//        arr[j] = arr[j]^arr[start];
//        arr[start] = arr[j]^arr[start];
//        arr[j] = arr[j]^arr[start];
        int temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;
        return j;
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
            System.out.println(Arrays.toString(arr));
            quickSort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr));
        }
    }
}
