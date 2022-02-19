package DynamicProgramming;

import java.util.Scanner;

public class EggDroppingProblem {
    public static int eggsDropping(int eggs, int floors){
        // Base Case
        if(floors == 1 || floors == 0){
            return floors;
        }
        // if We have one Egg then Then We Need n floors for trials
        if(eggs == 1){
            return floors;
        }
        // Consider All Floors from 1 to n
        int min = Integer.MAX_VALUE;
        for(int x=1; x<=floors; x++){
            int ans = Math.max(eggsDropping(eggs-1, x - 1), eggsDropping(eggs, floors - x));
            if(min > ans){
                min = ans;
            }
        }
        return 1+min;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            // Take Number of Eggs
            int n = sc.nextInt();
            // Take Number of Floors
            int k = sc.nextInt();
            int ans = eggsDropping(n, k);
            System.out.println(ans);
        }
    }
}
