package DynamicProgramming;

import java.util.Scanner;

public class LadderProblemBottomUpDP {
    public static int ladderProblem(int n, int k){
        int []storage = new int[n+1];
        storage[0] = 1;
        for(int i=1; i<storage.length; i++){
            int summation = 0;
            for(int j=1; j<=k; j++){
                if(i-j >= 0) {
                    summation += storage[i - j];
                }
            }
            storage[i] = summation;
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
