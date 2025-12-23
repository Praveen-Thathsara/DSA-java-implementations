package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queueActivity02 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integers : ");
        int num1 = sc.nextInt();
        q.add(num1);

        System.out.println("Enter the integers : ");
        int num2 = sc.nextInt();
        q.add(num2);

        System.out.println("Enter the integers : ");
        int num3 = sc.nextInt();
        q.add(num3);

        System.out.println("Enter the integers : ");
        int num4 = sc.nextInt();
        q.add(num4);


        System.out.println("the queue is : "+q);

        int rem = q.poll();
        System.out.println("Removed number : "+rem);

        System.out.println("Current Queue : "+q);

        boolean emp = q.isEmpty();
        System.out.println("IS Queue empty : "+emp);




    }
}
