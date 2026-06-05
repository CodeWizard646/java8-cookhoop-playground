package coreJavaQandA.finalFinallyAndFinalize;

public class Test {

    public static void main(String[] args)
    {
//        Employee e1 = new Employee("Google");
//
//          e1.id = 1l;
//          e1.name = "sudhanshu";
//
//          e1.printEmployeeInfo();
//
//
//        Employee e2 = new Employee("Amazon");
//
//        e2.id = 2l;
//        e2.name = "Rohit";
//
//        e2.printEmployeeInfo();


        Employee e = new Employee();
        e.greet();

        Intern i = new Intern();
        i.greet();

        Manager m = new Manager();
        m.greet();


    }
}
