package coreJavaQandA.finalFinallyAndFinalize;

public class Employee {

    Long id;
    String name;
    String company;
//    final String company = "Google";

   public Employee(String company)
    {
        this.company = company;
    }

    public Employee(Long id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Employee() {
    }

    public void printEmployeeInfo()
    {
        System.out.println("Id : "+id);
        System.out.println("Name : " +name);
        System.out.println("Company : " +company);
    }


    public  void greet(){
       System.out.println("Hello, I am an Employee");
    }
}
