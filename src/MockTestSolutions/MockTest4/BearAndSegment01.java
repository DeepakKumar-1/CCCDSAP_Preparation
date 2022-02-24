package MockTestSolutions.MockTest4;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BearAndSegment01
{
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int i = 0;
            int j = s.length()-1;
            boolean flag = true;
            while(s.charAt(i) != '1'){
                i++;
                if(i >= s.length()){
                    flag = false;
                    System.out.println("NO");
                    break;
                }
            }
            if(flag){
                while(s.charAt(j) != '1'){
                    j--;
                    if(j < 0){
                        flag = false;
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if(flag){
                for(int m = i; m<=j; m++){
                    if(s.charAt(m) == '0'){
                        System.out.println("NO");
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println("YES");
                }
            }
        }
    }
}