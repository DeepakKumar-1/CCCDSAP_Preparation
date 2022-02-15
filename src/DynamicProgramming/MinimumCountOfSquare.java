package DynamicProgramming;

import java.util.Scanner;

public class MinimumCountOfSquare {
    public static int minCountOfSquares(int n){
        // Base case
        if(n == 1){
            return 1;
        }
        int minCount = n;

        for(int i=1; i<=Math.sqrt(n); i++){
            int op = 1 + minCountOfSquares(n-i*i);
            if(minCount > op){
                minCount = op;
            }
        }
        return minCount;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            System.out.println("Minimum Count of Squares: " + minCountOfSquares(n));
        }
    }
}
