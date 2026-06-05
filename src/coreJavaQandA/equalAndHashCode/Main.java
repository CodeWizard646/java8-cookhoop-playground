package coreJavaQandA.equalAndHashCode;

import java.util.HashSet;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("------Object class equals method meant for reference comparison(Address comparison)-------------");
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Sudhanshu";

        Employee e2 = new Employee();

        e2.id = 1;
        e2.name = "Sudhanshu";

//        System.out.println(e1.equals(e2)); //false

        // this returns false because object class equals method is implemented for
        // address comparison(Reference comparison) that's why it returns false.

        System.out.println("------String class equals method meant for Content comparison(object's content comparison)-------------");


//        String s1 = new String("Sudhanshu");
//        String s2 = new String("Sudhanshu");

//        System.out.println(s1.equals(s2)); // true

        //so sir that's why String class
        // equals method return true even they are different
        // object(located at different memory area)  but the content is the
        // same that's why String class equals() method returns true.


        HashSet<Employee> set1 = new HashSet<>();

        set1.add(e1);
        set1.add(e2);

        System.out.println(set1.size());


        // Because HashSet doesn't allow duplicate values.

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(1);

        System.out.println(set2.size());




    }
}
