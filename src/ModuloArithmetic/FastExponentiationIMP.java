package ModuloArithmetic;
import java.util.Scanner;
public class FastExponentiationIMP {
    static final int MOD = 1000000007;
    static long fastExp(int base, int exp){
        long res = 1;
        while(exp > 0){
            if(exp % 2 == 1){
                res = (res% MOD * base% MOD)% MOD;
            }
            base = (base% MOD * base% MOD)% MOD;
            exp = exp >> 1; // exp/=2
        }
        return res % MOD;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int base = sc.nextInt();
            int exp = sc.nextInt();
            long ans = fastExp(base, exp);
            System.out.println(ans);
        }
    }
}
