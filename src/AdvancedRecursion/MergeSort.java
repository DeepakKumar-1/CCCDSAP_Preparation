package AdvancedRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void display(int []arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int []arr, int start, int end){
        // when to Stop ?
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int []arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int []mix = new int[end - start + 1];
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int c=start, m = 0; c<=end; c++, m++){
            arr[c] = mix[m];
        }
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
            display(arr);
            mergeSort(arr, 0, arr.length-1);
            display(arr);
        }
    }
}
