// Cell Mitosis Without Using Decrement Operation
//package DynamicProgramming;
//
//import java.util.Scanner;
//
//public class CellMitosis {
//    private static int cellMitosis(int c, int n, int x, int y, int z, int cost){
//        if(c >= n){
//            return cost;
//        }
//        if(c < 0){
//            return Integer.MAX_VALUE;
//        }
//        // Double it
//        int op1 = cellMitosis(c*2, n, x, y, z, cost+x);
//        // Increase by one
//        int op2 = cellMitosis(c+1, n, x, y, z, cost+y);
//        // Decrease by one
////        int op3 = cellMitosis(c-1, n, x, y, z, cost+z);
//        return Math.min(op1, op2);
//    }
//    public static int cellMitosis(int n ,int x, int y, int z){
//        return cellMitosis(1, n, x, y, z, 0);
//    }
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        while(tc-- > 0){
//            int n = sc.nextInt();
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = sc.nextInt();
//            int ans = cellMitosis(n, x, y, z);
//            System.out.println(ans);
//        }
//    }
//}
