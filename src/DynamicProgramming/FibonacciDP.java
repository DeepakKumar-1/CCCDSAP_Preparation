package DynamicProgramming;
import java.util.Scanner;

public class FibonacciDP {

    private static int fibDP(int num) {
        int []storage = new int[num+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2; i<=num; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[num];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int num = sc.nextInt();
            System.out.println(fibDP(num));
        }
    }
}
