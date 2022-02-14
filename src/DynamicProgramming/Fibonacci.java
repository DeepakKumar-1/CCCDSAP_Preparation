package DynamicProgramming;
import java.util.Scanner;
import java.util.Arrays;
public class Fibonacci {

    private static int fib(int num) {
        int []storage = new int[num+1];
        // initialize All Values of Storage Array with -1
        Arrays.fill(storage, -1);
        return fib(num, storage);
    }
    private static int fib(int num, int []storage){
        // Base Case
        if(num == 0 || num == 1){
            storage[num] = num;
            return storage[num];
        }
        if(storage[num] != -1){
            return storage[num];
        }
        // Now Compute and Store
        storage[num] = fib(num-1, storage) + fib(num-2, storage);
        return storage[num];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            // Take A Number
            int num = sc.nextInt();
            // Now Solve Fibonacci and Print it
           int ans = fib(num);
           System.out.println(ans);
        }
    }
}
