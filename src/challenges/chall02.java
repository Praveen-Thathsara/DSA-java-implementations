package challenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class chall02 {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number list : ");

        for(int i=0 ; i < 5; i++){
            int num = sc.nextInt();
            l.add(num);
        }

        System.out.println("the list is : "+l);

        int rem = l.remove(2);

        System.out.println("removed element : "+rem);

        for(int i : l){
            q.add(i);
        }

        System.out.println("the queue is :"+q);
    }
}
