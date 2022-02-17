package ModuloArithmetic;

import java.util.Scanner;

public class ModuloOperation {
    /*
    NOTE : Why To Take Modulo by 10^9 + 7
    Because it FullFills Following Two Conditions
    1. Number is Very Large
    2. Number must be Prime
    Why so ?? Because we Want that Two Nearest Numbers must have Different Modulo Answer
     */

    public static int modulo(int num, int MOD){
        return num % MOD;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int num = sc.nextInt();
            int MOD = sc.nextInt();
            int ans = modulo(num, MOD);
            System.out.println(ans);
        }
    }
}
