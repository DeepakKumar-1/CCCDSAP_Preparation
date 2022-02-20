package Strings;

import java.util.Scanner;

public class ChefAndFriends {
    public static void solve(String []arr){
        int count = 0;
        for(String s : arr){
            if(s.contains("ch") || s.contains("he") || s.contains("ef")){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
        solve(arr);
    }
}
