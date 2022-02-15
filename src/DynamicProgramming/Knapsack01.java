package DynamicProgramming;
import java.util.*;
public class Knapsack01 {
    private static int knapsack(int []values, int []weight, int maxWeight, int i){
        if(i == weight.length || maxWeight == 0){
            return 0;
        }

        if(weight[i] > maxWeight){
            return knapsack(values, weight, maxWeight, i+1);
        } else {
            // Pick it
            int op1 = values[i] + knapsack(values, weight, maxWeight-weight[i], i+1);
            // discard it
            int op2 = knapsack(values, weight, maxWeight, i+1);
            return Math.max(op1, op2);
        }
    }
    public static int knapsack(int []values, int []weight, int maxWeight){
        return knapsack(values, weight, maxWeight, 0);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []values = new int[n];
            for(int i=0; i<values.length; i++){
                values[i] = sc.nextInt();
            }
            int []weight = new int[n];
            for(int i=0; i<weight.length; i++){
                weight[i] = sc.nextInt();
            }
            int maxWeight = sc.nextInt();
            int ans = knapsack(values,weight, maxWeight);
            System.out.println(ans);
        }
    }
}

/*
        1
        5
        10 5 4 8 6
        6 1 2 4 5
        5
        13
 */