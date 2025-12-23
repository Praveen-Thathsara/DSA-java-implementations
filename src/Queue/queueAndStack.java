package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueAndStack {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(9);

        System.out.println("original q :"+ q);

        while(!q.isEmpty()){
            s.add(q.poll());
        }

        System.out.println("the Stack : "+s);

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        System.out.println("the q after reverse : "+q);


    }
}
