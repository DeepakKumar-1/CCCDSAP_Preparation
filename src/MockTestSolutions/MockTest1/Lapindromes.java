package MockTestSolutions.MockTest1;

import java.util.HashMap;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) throws java.lang.Exception {

        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            lapindrome(s);
        }
    }

    public static void lapindrome(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int n = s.length();
        // There are Two Cases n can be either Even or Odd
        if (n % 2 == 0) {
            // iterate Over First Half
            for (int i = 0; i < n / 2; i++) {
                char ch = s.charAt(i);
                if (map1.containsKey(ch)) {
                    map1.put(ch, map1.get(ch) + 1);
                } else {
                    map1.put(ch, 1);
                }
            }
            // Now Iterate Over Second Half
            for (int j = n / 2; j < n; j++) {
                char ch = s.charAt(j);
                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.get(ch) + 1);
                } else {
                    map2.put(ch, 1);
                }
            }
            boolean flag = true;
            // Now Iterate Over Both the map
            for (char c : map1.keySet()) {
                if (map1.get(c) != map2.get(c)) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            }
        } else {
            // iterate Over First Half
            for (int i = 0; i < n / 2; i++) {
                char ch = s.charAt(i);
                if (map1.containsKey(ch)) {
                    map1.put(ch, map1.get(ch) + 1);
                } else {
                    map1.put(ch, 1);
                }
            }
            // Now Iterate Over Second Half
            for (int j = n / 2 + 1; j < n; j++) {
                char ch = s.charAt(j);
                if (map2.containsKey(ch)) {
                    map2.put(ch, map2.get(ch) + 1);
                } else {
                    map2.put(ch, 1);
                }
            }
            boolean flag = true;
            // Now Iterate Over Both the map
            for (char c : map1.keySet()) {
                if (map1.get(c) != map2.get(c)) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            }
        }
    }
}
