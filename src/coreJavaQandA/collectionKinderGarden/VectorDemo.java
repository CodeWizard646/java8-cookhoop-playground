package coreJavaQandA.collectionKinderGarden;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args)
    {
//        Vector v1 = new Vector(new ArrayList<>());
//
//        Vector v2 = new Vector(20);
//
//        Vector v3 = new Vector(20 , 5);

        Vector v = new Vector();    // initial capacity 10

        v.add("deepak");
        v.add(1,"rahul");
        v.addElement("ravi");
        v.add(100);
        v.add(24.54);
        v.add('g');
        v.add(null);
        v.add(null);
        v.add("deepak");

        v.add("deepak");
        v.add(1,"rahul");
        v.addElement("ravi");
        v.add(100);
        v.add(24.54);
        v.add('g');
        v.add(null);
        v.add(null);
        v.add("deepak");

        v.add("deepak");
        v.add(1,"rahul");
        v.addElement("ravi");
        v.add(100);
        v.add(24.54);
        v.add('g');
        v.add(null);
        v.add(null);
        v.add("deepak");

//        v.removeElementAt(2);
//
//        v.removeAllElements();
         v.setElementAt(420,3);
        System.out.println(v);
//        System.out.println(v.firstElement());
//        System.out.println(v.lastElement());

        System.out.println(v.capacity());
    }
}
