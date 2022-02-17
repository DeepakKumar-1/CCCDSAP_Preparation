package BasicRecursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int countDigits(int n){
        // Base Case
        if(n <= 0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = countDigits(n);
            System.out.println(ans);
        }
    }
}
