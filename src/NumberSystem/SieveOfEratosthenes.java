package NumberSystem;

import java.util.Scanner;

public class SieveOfEratosthenes {
    // Sieve of Eratosthenes
    // Time Complexity O(N * log(logN))
    // Space Complexity O(N)
    public static void sieve(int n){
        boolean []primes = new boolean[n + 1];
        sieive(n, primes);
    }
    // Assumption: False Indicate Number is Prime
    private static void sieive(int n, boolean []primes){
        for(int i=2; i*i<=n; i++){
            // if False (i.e This Number is Prime) then make all factors of it True
            if(!primes[i]){
                // make all multiple of i to true
                for(int j = i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        // if False then print the Index
        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            sieve(n);
        }
    }
}
