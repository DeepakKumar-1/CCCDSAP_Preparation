package BasicRecursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = sum(n);
            System.out.println(ans);
        }
    }
}
