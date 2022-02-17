package NumberSystem;

import java.util.Scanner;

public class PrimeNumbersFrom1ToN {
    private static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            System.out.println(countPrime(n));
        }
    }
}
