package Stacks;

import java.util.Stack;

public class balanceparen {
    public static void main(String[] args) {

        String str = "((a+b))";
        Stack<Character> stack = new Stack<>();
        boolean isbal = true;

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(str.charAt(i));
            }else if(c == ')'){
                if(stack.isEmpty()){
                    isbal = false;
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            isbal = false;
        }

        if(isbal){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balance");
        }
    }
}
