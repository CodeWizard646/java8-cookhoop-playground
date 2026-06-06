package coreJavaQandA.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Employee e1 = new Employee(1,"Sachit",25);
        Employee e2 = new Employee(3,"Kunal",21);
        Employee e3 = new Employee(4,"Sumit",28);
        Employee e4 = new Employee(2,"Pushp",31);
        Employee e5 = new Employee(5, "Manas",18);


//        System.out.println(e2.compareTo(e1));
//        System.out.println(e2.compareTo(e3));


        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("-----------Sorting based on employee Id---------------");

        Collections.sort(employees,(a,b)->{
            if(a.getId() == b.getId()){
                return 0;
            }else if(a.getId() > b.getId()){
                return 1;
            }else {
                return -1;
            }
        });

        print(employees);


        System.out.println("-----------Sorting based on employee Age---------------");


        Collections.sort(employees,(a,b)->{
            if(a.getAge() == b.getAge()){
                return 0;
            }else if(a.getAge() > b.getAge()){
                return 1;
            }else {
                return -1;
            }
        });

        print(employees);
    }


    public static void print(List<Employee> employeeList){
        for(Employee employee : employeeList){
            System.out.println("Id : " + employee.getId() + " Name : " + employee.getName() +
                    " Age : " +employee.getAge());
        }
    }
}
