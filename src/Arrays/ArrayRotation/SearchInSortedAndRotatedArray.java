package Arrays.ArrayRotation;;
import java.util.Scanner;

public class SearchInSortedAndRotatedArray {
    public static boolean search(int []arr, int key){
        int pivot = findPivot(arr, 0, arr.length-1);
        if(pivot == -1){
            return binarySearch(arr, 0, arr.length-1, key);
        }
        if(arr[pivot] == key){
            return true;
        }
        if(arr[0] >= key){
            return binarySearch(arr, pivot+1, arr.length-1, key);
        }
        return binarySearch(arr, 0, pivot-1, key);
    }
    public static boolean binarySearch(int []arr, int start, int end, int key){
        if (start > end){
            return false;
        }
        // Find mid
        int mid = start + (end - start)/2;
        if(arr[mid] == key){
            return true;
        } else if(arr[mid] > key){
            return binarySearch(arr, start, mid-1, key);
        }
        return binarySearch(arr, mid+1, end, key);
    }
    public static int findPivot(int []arr, int start, int end){
        if(end < start){
            return -1;
        }
        if(start == end){
            return start;
        }

        // Find mid
        int mid = start + (end -start)/2;
        if(mid < end && arr[mid] > arr[mid+1]){
            return mid;
        }else if(mid > start && arr[mid] < arr[mid-1]){
            return mid-1;
        } else if(arr[start] >= arr[mid])
            return findPivot(arr, start, mid-1);
        return findPivot(arr, mid+1, end);
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
        System.out.print("Enter Key Value to Search: ");
        int key = sc.nextInt();
        boolean ans = search(arr, key);
        System.out.println("Is Found: " + ans);
//        System.out.println(Arrays.toString(arr));
    }
}
