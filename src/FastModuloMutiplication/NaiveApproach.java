package FastModuloMutiplication;

import java.util.Scanner;

public class NaiveApproach {
    // For Example Calculate 3^10
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0) {
            System.out.print("Enter Base: ");
            int base = sc.nextInt();
            System.out.print("Enter Exponent: ");
            int exp = sc.nextInt();
            int ans = 1;
            for (int i = 1; i <= exp; i++) {
                ans *= base;
            }
            System.out.println(ans);
        }
    }
}
