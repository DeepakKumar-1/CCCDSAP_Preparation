package DynamicProgramming;

import java.util.Scanner;

public class MinStepsTo1DP {
    public static int minStepsTo1(int n){
        int []storage = new int[n+1];
        // Setting initial Values
        storage[1] = 0;
        for(int i=2; i<=n; i++){
            // Subtract by 1
            int countMin = storage[i-1];
            if(i % 2 == 0){
                int op2 = storage[i/2];
                if(op2 < countMin){
                    countMin = op2;
                }
            }
            if(i % 3 == 0){
                int op3 = storage[i/3];
                if(op3 < countMin){
                    countMin = op3;
                }
            }
            storage[i] = 1 + countMin;
        }
        return storage[n];
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
