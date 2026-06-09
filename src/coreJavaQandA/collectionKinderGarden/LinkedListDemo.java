package coreJavaQandA.collectionKinderGarden;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args)
    {

        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(2000);
        al.add(3000);
        al.add(4000);

        //1) heterogeneous allowed.
        //2) duplicate allowed.
        //3) multiple null values allowed.
        //4) LinkedList follows the insertion order.
        //5) doesn't follows the sorting order.
        //6) non-synchronized.
        LinkedList ll = new LinkedList(al);

        ll.add("deepak");
        ll.add("rahul");
        ll.add(105);
        ll.add(124.7);
        ll.add(23);
        ll.add(234);

        System.out.println(ll);

//        ll.addFirst("aaa");
//        ll.addLast("zzz");

//        ll.removeFirst();
//        ll.removeLast();



        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll);

    }
}
