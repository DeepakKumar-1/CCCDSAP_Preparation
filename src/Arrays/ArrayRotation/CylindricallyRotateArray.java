package Arrays.ArrayRotation;

import java.util.Arrays;
import java.util.Scanner;

public class CylindricallyRotateArray {
    public static void rotate(int []arr){
        int temp = arr[arr.length - 1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        // Take Elements
        System.out.print("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        rotate(arr);
        System.out.println("Rotated Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
