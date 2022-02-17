package BasicRecursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = fibonacci(n);
            System.out.println(ans);
        }
    }
}
