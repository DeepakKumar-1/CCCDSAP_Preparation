package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {
    public static int LCS(String s, String t){
        // Base case
        if(s.isEmpty() || t.isEmpty()){
            return 0;
        }
        if(s.charAt(0) == t.charAt(0)){
            return 1 + LCS(s.substring(1), t.substring(1));
        } else {
            int op1 = LCS(s, t.substring(1));
            int op2 = LCS(s.substring(1), t);
            int op3 = LCS(s.substring(1), t.substring(1));
            return Math.max(op1, Math.max(op2, op3));
        }
    }

//    public static String LCS2(String s, String t, String ans){
//        // Base case
//        if(s.isEmpty() || t.isEmpty()){
//            return ans;
//        }
//        if(s.charAt(0) == t.charAt(0)){
//            LCS2(s.substring(1), t.substring(1), ans+s.charAt(0));
//        } else {
//            LCS2(s, t.substring(1), ans);
//            LCS2(s.substring(1), t, ans);
//            LCS2(s.substring(1), t.substring(1), ans);
//        }
//        return ans;
//    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            String t = sc.next();
            int ans = LCS(s, t);
            System.out.println(ans);
//            System.out.println(LCS2(s, t, ""));
        }
    }
}
