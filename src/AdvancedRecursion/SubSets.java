package AdvancedRecursion;
import java.util.Scanner;

public class SubSets {
    // Non-adjacent Collection
    public static void subString(String s, String p) {
        for(int i=0; i<Math.pow(2, s.length()); i++){
            String str = Integer.toBinaryString(i);
            System.out.println(str);
            StringBuilder ans = new StringBuilder();
            for(int j=0; j<str.length(); j++){
                if(str.charAt(0) == '1'){
                    ans.append(s.charAt(j));
                }
            }
            System.out.print(ans + " ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            subString(s, "");
        }
    }
}
