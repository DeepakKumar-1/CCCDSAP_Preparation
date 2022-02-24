package MockTestSolutions.MockTest3;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndSocks
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        long jacketCost = sc.nextLong();
        long socksCost= sc.nextLong();
        long money = sc.nextLong();
        long temp = money - jacketCost;
        if(temp < 0){
            System.out.println("Unlucky Chef");
        }
        else if((temp/socksCost)%2 == 0){
            System.out.println("Lucky Chef");
        } else {
            System.out.println("Unlucky Chef");
        }

    }
}
