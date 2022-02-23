package DynamicProgramming;

import java.util.*;
public class ChefAndString {
    public static int chefAndString(String s){
        char []arr = s.toCharArray();
        int count = 0;
        int i=0;
        while(i<arr.length-1){
            boolean flag = true;
            if(i+1 < arr.length && arr[i] == 'x' && arr[i+1] == 'y'){
                count++;
                i+= 2;
                flag = false;
            }
            if(i+1 < arr.length && arr[i] == 'y' && arr[i+1] == 'x'){
                count++;
                flag = false;
                i+= 2;
            }
            if(flag){
                i++;
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            String s = sc.next();
            int ans = chefAndString(s);
            System.out.println(ans);
        }
    }
}
