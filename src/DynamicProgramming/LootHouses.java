package DynamicProgramming;

import java.util.Scanner;

public class LootHouses {
    public static int lootHouses(int []houses, int n){
        // Base Cases
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return houses[n];
        }
        // We Can Either pick or not
        int pick = houses[n] + lootHouses(houses, n-2);
        // not pick
        int notPick = lootHouses(houses, n-1);
        return Integer.max(pick, notPick);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []houses = new int[n];
            for(int i=0; i<n; i++){
                houses[i] = sc.nextInt();
            }
            int ans = lootHouses(houses, houses.length - 1);
            System.out.println(ans);
        }
    }
}
