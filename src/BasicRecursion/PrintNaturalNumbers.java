package BasicRecursion;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void display(int n){
        // Base Case
        if(n == 0){
            return;
        }
        display(n-1);
        System.out.print(n + " ");
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            display(n);
        }
    }
}
