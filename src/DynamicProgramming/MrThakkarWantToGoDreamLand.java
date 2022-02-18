package DynamicProgramming;

import java.util.Scanner;

public class MrThakkarWantToGoDreamLand {
    public static int minCost(int n){
        int []storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        for(int i=2; i<storage.length; i++){
            if(i%2 == 0){
                storage[i] = Math.min(storage[i-1] + 1, storage[i/2] + 2);
            } else{
                storage[i] = storage[i-1]+1;
            }
        }
        return storage[n];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int ans = minCost(n);
            System.out.println(ans);
        }
    }
}
