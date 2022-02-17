package BasicRecursion;

import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        // Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = fact(n);
            System.out.println(ans);
        }
    }
}
