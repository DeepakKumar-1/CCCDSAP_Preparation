package NumberSystem;

import java.util.Scanner;

public class LinearDiophantineEquation {
    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static boolean isDiophantine(int a, int b, int c){
        return c % gcd(a,b) == 0;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(isDiophantine(a, b, c)) {
                System.out.format("%dx + %dy = %d is Diophantine Equation", a, b, c);
            } else {
                System.out.format("%dx + %dy = %d is not a Diophantine Equation", a, b, c);
            }
        }
    }
}
