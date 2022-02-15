package DynamicProgramming;

import java.util.Scanner;

public class EditDistanceMemoization {
    private static int editDistance(String s, String t, int [][]storage){
        int m = s.length();
        int n = t.length();
        if(storage[m][n] != -1){
            return storage[m][n];
        }
        // Base Case
        if(s.isEmpty()){
            storage[m][n] = n;
            return storage[m][n];
        }
        if(t.isEmpty()){
            storage[m][n] = m;
            return storage[m][n];
        }
        // If Not Calculated and also not a Base Case
        // then Find the Solution
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = editDistance(s.substring(1), t.substring(1), storage);
            return storage[m][n];
        } else {
            // Insert
            int op1 = editDistance(s, t.substring(1), storage);
            // Delete
            int op2 = editDistance(s.substring(1), t, storage);
            // Substitute
            int op3 = editDistance(s.substring(1), t.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
            return storage[m][n];
        }
    }
    public static int editDistance(String s, String t){
        int m = s.length();
        int n = t.length();
        int [][]storage = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                storage[i][j] = -1;
            }
        }
        return editDistance(s, t, storage);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            String t = sc.next();
            int ans = editDistance(s, t);
            System.out.println(ans);
        }
    }
}
