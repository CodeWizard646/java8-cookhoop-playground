package coreJavaQandA.collectionKinderGarden;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args)
    {

        //1) are index based DS.
        //2) Can Store different datatype or Heterogenous datatypes.
        //3) can store duplicate values.
        //4) can store any number of null values.
        //5) follows the insertion order.
        //6) doesn't follows the sorting order
        //7) non-synchronozed
        ArrayList al1 = new ArrayList();

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        al1.add(10);
        al1.add(10);

        al1.add(null);
        al1.add(null);


        ArrayList al2 = new ArrayList();

        al2.add(100);
        al2.add("Deepak");
        al2.add("rahul");

        al1.addAll(al2);

        System.out.println(al1);

        al1.remove(6);

        System.out.println(al1);

    }
}
