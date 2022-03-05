package AdvancedRecursion;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LexicographicallySmallestSubSequence {
    public static int[] lexicographicallySmallestSequence(int []arr, int k){
        int c = arr.length - k;
        Stack<Integer> stack = new Stack<>();
        for(int ele : arr){
            while(!stack.isEmpty() && c>0 && stack.peek()>ele){
                stack.pop();
                c--;
            }
            stack.push(ele);
        }
        while (stack.size() > k){
            stack.pop();
        }
        int []ans = new int[k];
        for (int i=k-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(lexicographicallySmallestSequence(arr, k)));
        }
    }
}
