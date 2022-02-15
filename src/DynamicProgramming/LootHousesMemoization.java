package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class LootHousesMemoization {
    private static int lootHouses(int[] houses, int n) {
        int []storage = new int[n];
        Arrays.fill(storage, -1);
        return lootHouses(houses, n, storage);
    }

    private static int lootHouses(int []houses, int n, int []storage){
        if(storage[n] != -1){
            return storage[n];
        }
        if(n < 0){
            return 0;
        }
        if(n == 0){
            storage[n] = houses[n];
            return storage[n];
        }
        int pick = houses[n] + lootHouses(houses, n-2, storage);
        int notPick = lootHouses(houses, n-1, storage);
        storage[n] = Integer.max(pick, notPick);
        return storage[n];
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
