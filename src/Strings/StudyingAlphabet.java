package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class StudyingAlphabet {
    public static void solve(String s, String str) {
        boolean flag = true;
        for (char ch : str.toCharArray()) {
            if (!s.contains(ch + "")) {
                System.out.println("No");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int words = sc.nextInt();
        while (words-- > 0) {
            String str = sc.next();
            solve(s, str);
        }
    }
}
