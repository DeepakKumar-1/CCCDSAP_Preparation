package Strings;
import java.util.Scanner;
public class CountSubStrings {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int lengthOfStr = sc.nextInt();
            String str = sc.next();
            long ans = solve(str, lengthOfStr);
            System.out.println(ans);
        }
    }
    public static long solve(String str, int lengthOfStr){
        long n = 0;
        for (int i=0; i<lengthOfStr; i++){
            if(str.charAt(i) == '1'){
                n++;
            }
        }
        return (long)((n*n+n)/2);
    }
}
