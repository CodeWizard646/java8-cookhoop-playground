package coreJavaQandA.collectionKinderGarden;

import java.util.*;

public class ListInterface {

    public static void main(String[] args)
    {

        System.out.println("---------------list-------------------");

        //1) insertion based on index.
        //2) insertion order preserved.
        //3) duplicate allowed.
        //4) can insert any number of null.
        //5) can iterate the list using two iterator and listIterator.
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        // duplicate allowed
        l.add(20);
        l.add(30);

        // null allowed any number of times.
        l.add(null);
        l.add(null);

        System.out.println("---------------iterator-------------------");

        Iterator iterator = l.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(l);

        System.out.println("---------------set-------------------");

        //1) insertion based on hashCode.
        //2) so duplicate not allowed.
        //3) null allowed but only once because even null duplicate not allowed in set.
        //4) doesn't follow insertion order.
        //5) iteration allowed only using Iterator
        Set s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        // duplicate not allowed
        s.add(20);
        s.add(30);

        // null allowed but only once inserted not other
        s.add(null);
        s.add(null);

        System.out.println("---------------iterator-------------------");

        Iterator iterator1 = s.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println(s);

    }
}
