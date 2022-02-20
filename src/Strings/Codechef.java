package Strings;


import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void solve(String []arr){

        for(String str : arr){
            int start = 0;
            int end = str.length()-1;
            String s = "";
            boolean flag = true;
            while(start <= end){
                if(str.charAt(start)!='.' && str.charAt(end) != '.' && str.charAt(start) != str.charAt(end)){
                    System.out.println(-1);
                    flag = false;
                    break;
                } else{
                    if(str.charAt(start)=='.'){
                        s += str.charAt(end);
                    } else if(str.charAt(end) == '.'){
                        s += str.charAt(start);
                    } else{
                        s += str.charAt(start);
                    }
                }
                start++;
                end--;
            }
            if(flag){
                StringBuilder sb = new StringBuilder();
                if(s.length()%2 == 0){
                    sb.append(s);
                    sb.reverse();
                    s += new String(sb);
                } else{
                    for(int i=0; i<=s.length()/2; i++){
                        sb.append(s.charAt(i));
                    }
                    s = new String(sb);
                    sb.reverse();
                    s += 'a' + new String(sb);
                }
                System.out.println(s);
            }
        }
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
