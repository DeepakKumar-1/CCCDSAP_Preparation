package NumberSystem;

import java.util.Scanner;

public class GCD_EuclidAlgorithm {
    /*
    Euclid's Algorithm:
       gcd(a, b) = gcd(b, a % b)
       gcd(16, 10) = gcd(10, 6)
       gcd(10, 6) = gcd(6, 4)
       gcd(6, 4) = gcd(4, 2)
       gcd(4, 2) = gcd(2, 0)
       ........ STOP HERE !!
       Return a
     */
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b) {
                int ans = gcd(a, b);
                System.out.println(ans);
            } else{
                System.out.println(1);
            }
        }
    }
}
