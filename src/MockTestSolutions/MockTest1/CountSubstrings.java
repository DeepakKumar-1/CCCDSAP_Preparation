package MockTestSolutions.MockTest1;

import java.util.Scanner;

public class CountSubstrings {
        public static void main (String[] args) throws java.lang.Exception
        {

            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                String s = sc.next();
                long count = 0;
                for(int i=0; i<n; i++){
                    if(s.charAt(i) == '1'){
                        count++;
                    }
                }

                System.out.println((count*(count+1))/2);
            }
        }
}
