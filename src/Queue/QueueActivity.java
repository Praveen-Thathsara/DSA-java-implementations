package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueActivity {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(12);
        q.add(34);
        q.add(56);
        q.add(24);


        System.out.println("Queue :"+q);

        int removed = q.remove();
        System.out.println("remove Element : "+removed);

        System.out.println("peek element :"+ q.peek());

        System.out.println("the size : "+q.size());

        System.out.println("IsEmpty :"+q.isEmpty());
    }
}
