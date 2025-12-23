package challenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class chall01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Stack<Integer> s = new Stack<>();

        System.out.println("Enter the numbers : ");

        Scanner sc = new Scanner(System.in);
        for(int i =0; i <5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the array : ");
        for(int a : arr){
            System.out.println(a);
        }

        for(int i=0; i<arr.length; i++){
            s.add(arr[i]);
        }

        System.out.println("the Stack : "+ s);

        for(int i=0; i < arr.length; i++){
            arr[i] = s.pop();
        }

        for(int i=0; i<arr.length; i++){
            s.add(arr[i]);
        }

        System.out.println("the new stack :"+ s);
    }
}
