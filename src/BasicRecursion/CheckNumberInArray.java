package BasicRecursion;

import java.util.Scanner;

public class CheckNumberInArray {
    public static boolean checkNum(int []arr, int key, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == key){
            return true;
        }
        return checkNum(arr, key, index+1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int num = sc.nextInt();
            System.out.println(checkNum(arr, num, 0));
        }
    }
}
