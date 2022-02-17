package FastModuloMutiplication;

import java.util.Scanner;

public class FastExponentiation {

    public static long fast_exp(int base, int exp) {
        if(exp == 1){
            return base;
        }
        // if exp is Even
        if(exp%2 == 0){
            return (long) Math.pow(fast_exp(base, exp/2), 2);
        }
        // if exp is Odd
        else{
            return (long) (base * Math.pow(fast_exp(base, (exp-1)/2), 2));
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int base = sc.nextInt();
            int exp = sc.nextInt();
            long ans = fast_exp(base, exp);
            System.out.println(ans);
        }
    }
}
