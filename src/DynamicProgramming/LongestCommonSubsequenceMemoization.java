package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequenceMemoization {
    public static int LCS(String s, String t){
        int [][]storage = new int[s.length()+1][t.length()+1];
        for(int []row : storage){
            Arrays.fill(row, -1);
        }
        return LCS(s, t, storage);
    }
    private static int LCS(String s, String t, int [][]storage){
        int m = s.length();
        int n = t.length();
        if(storage[m][n] != -1){
            return storage[m][n];
        }

        // Base Case
        if(m == 0 || n == 0){
            storage[m][n] = 0;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = 1 + LCS(s.substring(1), t.substring(1), storage);
            return storage[m][n];
        } else{
            int op1 = LCS(s, t.substring(1), storage);
            int op2 = LCS(s.substring(1), t, storage);
            int op3 = LCS(s.substring(1), t.substring(1), storage); // Its Redundant
            storage[m][n] = Math.max(op1, Math.max(op2, op3));
            return storage[m][n];
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            String t = sc.next();
            int ans = LCS(s, t);
            System.out.println(ans);
        }
    }
}
