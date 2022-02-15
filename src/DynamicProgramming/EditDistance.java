package DynamicProgramming;

import java.util.Scanner;

public class EditDistance {
    public static int editDistance(String s, String t){
        // Base Case
        if(s.isEmpty()){
            return t.length();
        }
        if(t.isEmpty()){
            return s.length();
        }
        // Now Compare First Character of Both the Strings
        // if they are Equal
        if(s.charAt(0) == t.charAt(0)){
            return editDistance(s.substring(1), t.substring(1));
        } else {
            // Insert
            int op1 = editDistance(s, t.substring(1));
            // Delete
            int op2 = editDistance(s.substring(1), t);
            // Substitute
            int op3 = editDistance(s.substring(1), t.substring(1));
            return 1 + Math.min(op1, Math.min(op2, op3));
        }
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
