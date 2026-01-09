package linkedListact;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo {
    public static void main(String[] args) {
        LinkedList<String> ahasgawwa = new LinkedList<>();
// me add krn tika
        ahasgawwa.add("praveen");
        ahasgawwa.add("nadil");
        ahasgawwa.add("pramod");
        ahasgawwa.add(1,"kosa");
        ahasgawwa.addFirst("jeew");
        ahasgawwa.addLast("achintha");
        ahasgawwa.add("chamindu");

        System.out.println(ahasgawwa);

// remove krn tika
        ahasgawwa.remove();
        System.out.println(ahasgawwa);




//        for(String s : ahasgawwa){
//            System.out.println(s);
//        }
//
//        System.out.println();
//
//        Iterator<String> names = ahasgawwa.iterator();
//
//        while(names.hasNext()){
//            System.out.println(names.next());
//        }
    }
}
