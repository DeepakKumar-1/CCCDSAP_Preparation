package StackAndQueue;

import java.util.Arrays;
import java.util.Scanner;

// PENDING
public class JNEXT {
    private static boolean isIncreasingOrderSorted(char[] arr) {
        for(int i=0; i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    private static boolean isDescendingOrderSorted(char[] arr) {
        for(int i=0; i< arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void jNext(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        // check is descending Order Sorted
        if (isDescendingOrderSorted(arr)) {
            System.out.println("NOT POSSIBLE");
        } else if (isIncreasingOrderSorted(arr)) {
            // Now Swap Last Two Elements
            char temp = arr[arr.length - 1];
            arr[arr.length - 1] = arr[arr.length - 2];
            arr[arr.length - 2] = temp;
            // Now Form the Number
            int num = 0;
            for (int i = 0; i < n; i++) {
                num = num * 10 + (arr[i] - '0');
            }
            System.out.println(num);
        } else {
            int index = 0;
            // traverse Array from last and Find any number such that arr[i] > arr[i+1]
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    // if this Happens Store index of this Element
                    index = i;
                    break;
                }
            }
            // now from index to last find just greater Element
            int[] a = new int[arr.length - index];
            for (int i = 0; i < a.length; i++) {
                a[i] = arr[index + 1 + i];
            }
            Arrays.sort(a);
            int element = 0;
            // Now Find Just Greater Element
            for (int ele : a) {
                if (ele > arr[index]) {
                    element = ele;
                    break;
                }
            }
            int index2 = 0;
            // Now Find this Element in Array
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[i] == element) {
                    index2 = i;
                    break;
                }
            }
            // Now swap
            char temp = arr[index];
            arr[index] = arr[index2];
            arr[index2] = temp;
            // Now Form the Number
            int num = 0;
            for (int i = 0; i < n; i++) {
                num = num * 10 + (arr[i] - '0');
            }
            System.out.println(num);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            jNext(n);
        }
    }
}
