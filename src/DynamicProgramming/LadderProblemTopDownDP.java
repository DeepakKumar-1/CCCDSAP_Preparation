package DynamicProgramming;

import java.util.Scanner;

public class LadderProblemTopDownDP {
    private static int ladder(int n, int k, int []storage){
        if(storage[n] != 0){
            return storage[n];
        }
        // Base case
        if(n == 0){
            storage[n] = 1;
            return storage[n];
        }
        // make k number of Calls
        int possibleWays = 0;
        for(int i=1; i<=k; i++){
            if(n-i >= 0) {
                possibleWays += ladder(n - i, k, storage);
            }
        }
        storage[n] = possibleWays;
        return storage[n];
    }
    public static int ladder(int n, int k){
        int []storage = new int[n+1];
        return ladder(n, k, storage);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = ladder(n, k);
            System.out.println(ans);
        }
    }
}
