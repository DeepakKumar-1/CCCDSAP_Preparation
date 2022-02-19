package DynamicProgramming;

import java.util.Scanner;

public class LadderProblemOptimized {
    public static int ladderProblem(int n, int k){
        int []storage = new int[n+1];
        storage[0] = storage[1] = 1;
        for(int i=2; i<=k; i++){
            storage[i] = 2 * storage[i-1];
        }
        for(int i=k+1; i<storage.length; i++){
            storage[i] = 2 * storage[i-1]  -  storage[i-k-1];
        }
        return storage[n];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = ladderProblem(n, k);
            System.out.println(ans);
        }
    }
}
