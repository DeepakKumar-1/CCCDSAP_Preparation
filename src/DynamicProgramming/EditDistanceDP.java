package DynamicProgramming;

import java.util.Scanner;

public class EditDistanceDP {
    private static int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        int [][]storage = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            storage[i][0] = i;
        }
        for(int j=0; j<=n; j++){
            storage[0][j] = j;
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(m-i) == t.charAt(n-j)){
                    storage[i][j] = storage[i-1][j-1];
                } else{
                    storage[i][j] = 1 + Math.min(storage[i][j-1], Math.min(storage[i-1][j], storage[i-1][j-1]));
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
            int ans = editDistance(s, t);
            System.out.println(ans);
        }
    }
}
