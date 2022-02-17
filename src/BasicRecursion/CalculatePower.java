package BasicRecursion;

import java.util.Scanner;

public class CalculatePower {
    public static int power(int base, int exp){
        if(exp == 1){
            return base;
        }
        return base*power(base, exp-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int base = sc.nextInt();
            int exp = sc.nextInt();
            int ans = power(base, exp);
            System.out.println(ans);
        }
    }
}
