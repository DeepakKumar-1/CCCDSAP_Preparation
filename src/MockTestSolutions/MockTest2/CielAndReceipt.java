package MockTestSolutions.MockTest2;

import java.util.Scanner;

public class CielAndReceipt {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int ans = minMenus(p);
            System.out.println(ans);
        }
    }

    public static int minMenus(int p) {
        int[] menu = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int menus = 0;
        for (int i = menu.length - 1; i >= 0; i--) {
            int curr = menu[i];
            while (p >= curr) {
                p -= curr;
                menus++;
            }
        }
        return menus;
    }
}
