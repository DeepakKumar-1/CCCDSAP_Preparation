package AdvancedRecursion;
import java.util.Scanner;

public class Permutation {
    // Non-adjacent Collection
    public static void permutation(String s, String p) {
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(s.substring(1), first+ch+second);
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            permutation(s, "");
        }
    }
}
