package coreJavaQandA.collectionKinderGarden;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args)
    {

        ArrayList al = new ArrayList();
        al.add("deepak");
        al.add("rahul");
        al.add("amit");

        //1) HashSet inserts value according to "hashCode".
        //2) Doesn't allow duplicate.
        //3) can't store  multiple null values.
        //4) Doesn't allow the insertion order.
        //5) Doesn't follows the sorting order.
        //6) Non-synchronized data-structure.

        HashSet hs = new HashSet();

        hs.addAll(al);
        hs.add(10);
        hs.add("deepak");
        hs.add(100.55);
        hs.add(null);
        hs.add("xyz");
        hs.add(true);
        hs.add("deepak");
        hs.add(10);
        hs.add(null);

        System.out.println(hs.size());
        System.out.println(hs);

        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
