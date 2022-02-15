package DynamicProgramming;

import java.util.Scanner;

public class NumberOfBalancedBSTofHeightH {
    public static int balancedBST(int h){
        int mod = (int)(Math.pow(10, 9)) + 7;
        return balancedBST(h, mod);
    }
    public static int balancedBST(int h, int mod){
        // Base Case
        if(h == 0 || h == 1){
            return 1;
        }

        int x = balancedBST(h-1);
        int y = balancedBST(h-2);
        long res1 = (long)x*x;
        long res2 = (long)x*y*2;
        int value1 = (int)(res1 % mod);
        int value2 = (int)(res2 % mod);
        return (value1 + value2)%mod;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int h = sc.nextInt();
            int ans = balancedBST(h);
            System.out.println("Number of BST: " + ans);
        }
    }
}
