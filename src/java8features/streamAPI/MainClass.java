package java8features.streamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("===============Pre-defined Functional Interface Examples=======");


//        Predicate<Integer> p1 = num-> num%2==0;
//
//        Function<Integer, Integer> f1 = num -> num*num;
//
//        Consumer<String> c1 = str -> System.out.println("Consumer doesn't return any thing " +str);
//
//        Supplier<Integer> s1 = () -> (int) Math.random();


        System.out.println("===============List of Integer stream Operations==================");


//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        Stream<Integer> stream = list.stream();

//        stream.forEach((element) -> System.out.println(element));

//        stream.filter((element) -> element%2==0)
//                .forEach((element) -> System.out.println(element));

//        stream.filter((element)-> element%2==0)
//                .map((element) -> element*element)
//                .forEach((element) -> System.out.println(element));

        
        System.out.println("===============List of Employees==================");

        List<Employee> employees = Arrays.asList(new Employee(1,"Amit","Tech"),
                new Employee(2,"Neha","HR"),
                new Employee(3,"Rahul","Tech"),
                new Employee(4,"Priya","Finance"),
                new Employee(5,"Vikas","Tech"),
                new Employee(6,"Sneha","Marketing"),
                new Employee(7,"Arjun","Tech"));

        // -> Our goal is to print the name of all the Employees whose department is Tech.

//        employees.stream().filter((employee) -> employee.getDepartment().equals("Tech"))
//                .map((employee) -> employee.getName())
//                .forEach((name) -> System.out.println(name));


        System.out.println("===============collect() method of Stream Interface==================");

        // collect() :-
        // it is method inside Stream interface which takes all the elements from
        // the stream and transform then into a final result like a list, set or Map;

//          List<String> employeeNames = employees.stream().filter((employee) -> employee.getDepartment().equals("Tech"))
//                .map((employee) -> employee.getName())
//                        .collect(Collectors.toList());
//
//          for(String name : employeeNames){
//              System.out.println("Employee name " +name);
//          }
//

        System.out.println("===============Converted Employee list into Map==================");

        // How can we convert this Employee into Map (Key , value) pair.

//        Function<Employee,Integer> f1 = (employee) -> employee.getId();
//        Function<Employee,String> f2 = (employee) -> employee.getName();
//
//        Map<Integer, String> collect = employees.stream().collect(Collectors.toMap(f1, f2));
//
//        System.out.println("Converted Employee list into Map : " +collect);
//

        System.out.println("===============Stream Once Consumed can't be reused==================");

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        Stream<Integer> s = list.stream();
//
//             s.filter((emp) -> emp%2==0)
//                     .map((emp) -> emp*emp)
//                     .collect(Collectors.toList());
//
//             s.filter((emp)-> emp%2==0);  // Exception in thread "main" java.lang.IllegalStateException:
                                                 // stream has already been operated upon or closed


        System.out.println("===============Intermediate Operations are lazy loaded==================");

        // Intermediate Operations are lazy loaded what does it mean
        // it means They execute only when a terminal Operation is added.


//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
//        list.stream().filter((elem)->{
//            System.out.println("Filter method called");
//                    if(elem%2==0){
//                        return true;
//                    }
//                    return false;
//          })
//                .map((empl)->
//                {
//                System.out.println("Map method called");
//                return empl*empl;
//                })
//                .collect(Collectors.toList());  // this is terminal method.


        System.out.println("===============More Stream methods==================");
        //1.findFirst()
        //2.AllMatch()
        //3.findAny()
        //4.noneMatch()
        //5.anyMatch()
        //6.Sorted()

        List<String> names = new ArrayList<>(Arrays.asList("Aman","Raj","Rohit","Riya",
                                             "Rahul","Ankit","Rina","Reshma"));
//
//        Optional<String> first = names.
//                stream()
//                .filter((str) -> str.startsWith("R"))
////                .findFirst();
//        .findAny();
//        System.out.println(first.get());

        //5.anyMatch()

//        boolean r = names.stream()
//                .anyMatch((str) -> str.startsWith("R"));
//
//        System.out.println(r);

        //2.AllMatch()

        boolean allMatch = names.stream()
                .allMatch((str) -> str.length()>1);

        System.out.println(allMatch);

        //4.noneMatch()

//        boolean noneMatch = names.stream()
////                .noneMatch((str) -> str.length() > 1); // false
////                .noneMatch((str) -> str.startsWith("R")); //false
//                  .noneMatch((str) -> str.startsWith("Z")); //true
//        System.out.println(noneMatch);


        //6.Sorted()

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3,2,-2,45,21,17));

                  numbers.stream()
                          .sorted()
                          .forEach((num) -> System.out.println(num));

    }



}
