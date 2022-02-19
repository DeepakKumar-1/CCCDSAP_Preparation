package MockTestSolutions.MockTest2;

import java.util.Scanner;

public class LittleElephantAndCandies {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int sum = 0;
            for(int i=0; i<n; i++){
                int k = sc.nextInt();
                sum+=k;
            }
            if(sum <= c){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}
