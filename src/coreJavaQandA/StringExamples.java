package coreJavaQandA;

public class StringExamples {

    public static void main(String[] args)
    {
        String s1 = "Sudhanshu";
        String s2 = "Sudhanshu";


        // '==' operator meant for reference(address) comparison.
        // it doesn't compare actual value.
        System.out.println(s1 == s2);

        // String class equals method
        // meant for content comparison(actual value comparison)
        System.out.println(s1.equals(s2));




        //Because these two objects take memory in heap area.
        //and also in SCP so there address pointing to different memory location
        //that's why return false;

        String str1 = new String("city");
        String str2 = new String("city");



        System.out.println(str1 == str2);

        //Because String class equals
        // method meant for actual value comparison(Content comparison)
        System.out.println(str1.equals(str2));

        System.out.println("------------Naman---------------");

        String name3 = "Naman";

        String name4 = new String("Naman");

        System.out.println(name3 == name4); // Address comparison(reference comparison)

        System.out.println(name3.equals(name4)); // Content comparison

        String name5 = new String("Naman");
        name5 = "Naman";

        System.out.println(name3 == name5);  // Because both are pointing to same 'Naman' in SCP
        System.out.println(name3.equals(name5));  // Content comparison


        System.out.println("-------------------name5 = null-----------------------");

        name5 = null;

        System.out.println(name3 == name5);
        System.out.println(name3.equals(name5));


     }
}
