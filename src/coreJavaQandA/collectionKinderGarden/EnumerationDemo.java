package coreJavaQandA.collectionKinderGarden;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(10);
        v.add("deepak");
        v.add(15.32);

        System.out.println(v);

        Enumeration elements = v.elements();

        while(elements.hasMoreElements())
        {
           System.out.println(elements.nextElement());
        }
    }
}
