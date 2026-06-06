package coreJavaQandA.mutableAndimmutable;

public class StringTypes {

    public static void main(String[] args)
    {
//        String s1 = "Hello";
//        String s4 = s1.concat("World");
//
//        StringBuffer s2 = new StringBuffer("Hello");
//        s2.append("World");
//
//        StringBuilder s3 = new StringBuilder("Hello");
//        s3.append("World");
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);



        String s1 = new String("Hello");
        String s2 = new String("Hello");


        StringBuffer s3 = new StringBuffer("Hello");
        StringBuffer s4 = new StringBuffer("Hello");

        StringBuilder s5 = new StringBuilder("Hello");
        StringBuilder s6 = new StringBuilder("Hello");


        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s5 == s6);


        System.out.println("-------------equals-----------------");

        //Because In String .equals() method
        // are overridden for content Comparison (Actual value comparison)
        System.out.println(s1.equals(s2)); //true


        // Whereas In StringBuffer .equals method are not overridden
        // they are using object class .equals method which is meant for
        // reference comparison(Address comparison).
        System.out.println(s3.equals(s4)); //false

        // similarly In StringBuilder .equals method are not overridden
        // they are using object class .equals method which is meant for
        // reference comparison(address comparison).
        System.out.println(s5.equals(s6)); //false


        System.out.println("-------------equals-----------------");



    }

}
