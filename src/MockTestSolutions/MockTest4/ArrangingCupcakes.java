package MockTestSolutions.MockTest4;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrangingCupcakes
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=1; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    list.add(Math.abs(i-(n/i)));
                }
            }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}