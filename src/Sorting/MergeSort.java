package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class MergeSort {

    public static void mergeSort(int []arr, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            // Apply Merge Sort on LeftHalf of the Array
            mergeSort(arr, start, mid);
            // Apply Merge Sort on RightHalf of the Array
            mergeSort(arr, mid+1, end);
            // Now Merge Both the Halves
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int []arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = start;
        int []mix = new int[arr.length];
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Now Copy all the Elements from mix to Array arr
        for(int c = start; c <= end; c++){
            arr[c] = mix[c];
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        // Create an Array of size n
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Array Before Sorting
        System.out.print("Array Before Sorting is: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        // Array After Sorting
        System.out.print("Array After Sorting is: " + Arrays.toString(arr));
    }
}
