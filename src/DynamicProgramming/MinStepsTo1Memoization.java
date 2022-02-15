package DynamicProgramming;

import java.util.Scanner;

public class MinStepsTo1Memoization {
    public static int minStepsTo1(int n, int []storage){
        // Look up in Memo Table
        if(storage[n] != 0){
            return storage[n];
        }
        // Base Case
        if(n == 1){  // Steps Required to Go from 1 to 1 is 0
            storage[n] = 0;
            return storage[n];
        }
        // Subtract by 1
        int countMin = minStepsTo1(n-1, storage);
        // Divide by 2
        if(n % 2 == 0){
            int op2 = minStepsTo1(n/2, storage);
            if(op2 < countMin){
                countMin  = op2;
            }
        }
        // Divide by 3
        if(n % 3 == 0){
            int op3 = minStepsTo1(n/3, storage);
            if(op3 < countMin){
                countMin = op3;
            }
        }
        storage[n] =  1 + countMin;
        return storage[n];
    }

    public static int minStepsTo1(int n){
        int []storage = new int[n+1];
        return minStepsTo1(n, storage);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            System.out.println("Min Steps to 1: " + minStepsTo1(n));
        }
    }
}
