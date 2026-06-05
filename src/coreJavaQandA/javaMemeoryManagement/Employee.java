package coreJavaQandA.javaMemeoryManagement;

public class Employee {
    String name;  // instance variable stored in the Heap memory
    int age;

    static String company = "TheCuriousCoder";  // method area

    public void workHours(){
        int hours = 8;  // local variable stored in the stack memory
        System.out.println(hours);
    }
}
