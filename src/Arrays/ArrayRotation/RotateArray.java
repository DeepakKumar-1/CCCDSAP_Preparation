package Arrays.ArrayRotation;
import java.util.Scanner;
import java.util.Arrays;
public class RotateArray {
    public static void reverse(int []arr, int start, int end){
        while(start <= end){
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            start++;
            end--;
        }
    }
    public static void rotate(int []arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
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
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        rotate(arr, d);
        System.out.println("Rotated Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
