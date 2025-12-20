package Stacks;

import java.util.Stack;

public class reverseName {
    public static void main(String[] args) {

        String str = "JAVA";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length();i++){
            stack.push(str.charAt(i));
        }

        System.out.println("Original = "+ str);

        String rev = "";
        while(!stack.isEmpty()){
            rev = rev + stack.pop();
        }

        System.out.println("wrong ="+ rev);
    }
}
