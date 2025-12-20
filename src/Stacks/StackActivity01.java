package Stacks;

import java.util.Stack;

public class StackActivity01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(12);
        stack.add(34);
        stack.add(78);
        stack.add(90);

        for(Integer i : stack){
            System.out.println(i);
        }
        System.out.println();

        stack.push(45);

        for(Integer i : stack){
            System.out.println(i);
        }
        System.out.println();

        stack.pop();

        for(Integer i : stack){
            System.out.println(i);
        }
        System.out.println();


        for(Integer i : stack){
            System.out.println(i);
        }
        System.out.println();

        System.out.println(stack.peek());
        System.out.println();
        System.out.println(stack.size());

    }
}
