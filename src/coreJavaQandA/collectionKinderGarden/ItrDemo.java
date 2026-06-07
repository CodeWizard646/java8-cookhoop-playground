package coreJavaQandA.collectionKinderGarden;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItrDemo {

    public static void main(String[] args)
    {
        List l = new ArrayList();

        l.add(10);
        l.add("depak");
        l.add("Rahul");

//        System.out.println(l);

//        Iterator iterator = l.iterator();

        ListIterator listIterator = l.listIterator();


        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("------------listIterator---------------------");


        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }

        listIterator.remove();

        System.out.println(l);


    }
}
