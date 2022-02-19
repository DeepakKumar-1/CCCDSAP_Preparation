package DynamicProgramming;

import java.util.Scanner;

public class CellMitosisIMP {
    public static int cellMitosis(int n, int x, int y, int z){
        // Bottom Up DP
        int []storage = new int[n+1];
        storage[0] = 0;
        storage[1] = 0;
        for(int i=2; i<storage.length; i++){
            if(i % 2 == 0){
                storage[i] = Math.min(storage[i/2] + x, storage[i-1] + y);
            }
            else{
                storage[i] = Math.min(storage[i-1] + y , storage[(i+1)/2] + x + z);
            }
        }
        return storage[n];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int ans = cellMitosis(n, x, y, z);
            System.out.println(ans);
        }
    }
}
