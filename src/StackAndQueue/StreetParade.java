package StackAndQueue;
import java.util.Scanner;
import java.util.Stack;

public class StreetParade {
    public static void stackParade(int []arr){
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        int expectedNum = 1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(expectedNum != arr[i]){
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                } else {
                    if (stack.peek() > arr[i]) {
                        stack.push(arr[i]);
                    } else {
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
            } else {
                expectedNum++;
            }
        }
        while(!stack.isEmpty() && flag){
            if(stack.peek() != expectedNum){
                System.out.println("NO");
                flag = false;
                break;
            } else{
                stack.pop();
                expectedNum++;
            }
        }
        if(flag){
            System.out.println("YES");
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            stackParade(arr);
        }
    }
}
