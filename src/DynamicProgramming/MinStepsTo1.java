package DynamicProgramming;
import java.util.*;
public class MinStepsTo1 {
    /*
    Operations we can Perform :
    1. Subtract by 1
    2. Divide by 2
    3. Divide by 3
     */
    public static int minStepsTo1(int n){
        // Base Case
        if(n == 1){  // Steps Required to Go from 1 to 1 is 0
            return 0;
        }
        // Subtract by 1
        int countMin = minStepsTo1(n-1);
        // Divide by 2
        if(n % 2 == 0){
            int op2 = minStepsTo1(n/2);
            if(op2 < countMin){
                countMin  = op2;
            }
        }
        // Divide by 3
        if(n % 3 == 0){
            int op3 = minStepsTo1(n/3);
            if(op3 < countMin){
                countMin = op3;
            }
        }
        return 1 + countMin;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            System.out.println("Min Steps to 1: " + minStepsTo1(n));
        }
    }
}
