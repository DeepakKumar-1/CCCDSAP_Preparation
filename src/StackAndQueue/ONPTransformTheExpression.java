package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ONPTransformTheExpression {

    private static boolean isOperator(char ch) {
        if(ch == '+' || ch == '-' || ch == '^' || ch == '*' || ch == '/'){
            return true;
        }
        return false;
    }

    private static int precedence(Character ch) {
        // +, -, *, /, ^
        if(ch == '^'){
            return 5;
        } else if(ch == '/'){
            return 4;
        } else if(ch == '*'){
            return 3;
        } else if(ch == '-'){
            return 2;
        }
        return 1;
    }
    //Infix to PostFix Conversion
    public static String infixToPostFix(String str){
        Stack<Character> stack = new Stack<>();
        char []infix = str.toCharArray();
        char []postfix = new char[infix.length + 1];
        int i=0; // Track infix Traversal
        int j=0; // Track postfix Traversal
        while (i != infix.length -1){
            if(!isOperator(infix[i])){
                postfix[j] = infix[i];
                i++;
                j++;
            } else {
                if(stack.isEmpty()){
                    stack.push(infix[i]);
                    i++;
                }
                if(precedence(infix[i]) > precedence(stack.peek())){
                    stack.push(infix[i]);
                    i++;
                } else{
                    postfix[j] = stack.pop();
                    j++;
                }
            }
        }
        while (!stack.isEmpty()){
            postfix[j] = stack.pop();
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<postfix.length; k++){
            sb.append(postfix[k]);
        }
        return new String(sb);
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String infix = sc.next();
            System.out.println(infixToPostFix(infix));
        }
    }
}
