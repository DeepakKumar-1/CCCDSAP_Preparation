package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Lapindromes {
    public static void main (String[] args) throws java.lang.Exception
    {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int start = 0;
            int end = str.length()-1;
            HashMap<Character , Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            boolean found = true;
            while(start < end){
                if(map1.containsKey(str.charAt(start))){
                    map1.put(str.charAt(start), map1.get(str.charAt(start)) + 1 );

                } else{
                    map1.put(str.charAt(start), 1 );
                }

                if(map2.containsKey(str.charAt(end))){
                    map2.put(str.charAt(end), map2.get(str.charAt(end)) + 1 );
                } else {
                    map2.put(str.charAt(end), 1 );
                }
                start++;
                end--;
            }

            for(char key : map1.keySet()){
                if(map1.get(key) != map2.get(key)){
                    System.out.println("NO");
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.println("YES");
            }
        }
    }
}
