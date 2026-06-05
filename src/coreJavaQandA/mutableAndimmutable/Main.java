package coreJavaQandA.mutableAndimmutable;

public class Main {

    public static void main(String[] args)
    {
        String name = "Shivam";

//      System.out.println(name);

        String name1 = "Shivam";
        String name2 = "Shivam";

        System.out.println("--------------------------------");

        System.out.println(name == name1);  // true
        System.out.println(name == name1);   // true

        name = "Naman";

        System.out.println("--------------name = Naman-------------------");

        System.out.println(name == name1);  // false
        System.out.println(name == name1);   // false

        System.out.println("---------------------------------------------");
        
        System.out.println(name);
        System.out.println(name1);


        System.out.println("---------------------------------------------");


        String s1 = "Hello";
        String s2 = s1+"World";

        System.out.println(s1);
        System.out.println(s2);
    }
}
