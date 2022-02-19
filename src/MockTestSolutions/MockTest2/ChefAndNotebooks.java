package MockTestSolutions.MockTest2;

import java.util.Scanner;

public class ChefAndNotebooks {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long NumberOfPagesLong = sc.nextLong();
            long pagesLeft = sc.nextLong();
            long money = sc.nextLong();
            int n   = sc.nextInt();
            boolean flag = false;
            long pages = NumberOfPagesLong - pagesLeft;
            for(int i=0; i<n; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                if(p >= pages && c <= money){
                    flag = true;
                }
            }
            if(flag){
                System.out.println("LuckyChef");
            } else {
                System.out.println("UnluckyChef");
            }
        }
    }
}
