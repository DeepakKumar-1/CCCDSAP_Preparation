package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequenceDP {
    public static int LCS(String s, String t){
        int m = s.length();
        int n = t.length();
        int [][]storage = new int[m+1][n+1];
        for(int i=0; i<storage.length; i++){
            storage[0][i] = 0;
        }
        for(int j=0; j<storage[0].length; j++){
            storage[j][0] = 0;
        }
        for(int i=1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(s.charAt(m-i) == t.charAt(n-j)){
                    storage[i][j] = 1 + storage[i-1][j-1];
                } else {
                    storage[i][j] = Math.max(storage[i][j-1], storage[i-1][j]);
                }
            }
        }
        return storage[m][n];
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
