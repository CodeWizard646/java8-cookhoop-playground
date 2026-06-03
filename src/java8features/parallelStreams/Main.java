package java8features.parallelStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Amit", "IT", 70000),
//                new Employee("Sneha", "Finance", 80000),
//                new Employee("Vikram", "Finance", 750000),
//                new Employee("Pooja", "HR", 60000),
//                new Employee("Arjun", "IT", 950000),
//                new Employee("Kavya", "Marketing", 650000),
//                new Employee("Rohit", "Marketing", 72000),
//                new Employee("Anjali", "HR", 58000)));

//        employees.stream()
//                .map(emp -> emp.getName())
//                .forEach(name -> System.out.println(name));
//
//        System.out.println("-----------Parallel Stream---------------");
//
//        employees.parallelStream()
//                .map(emp -> emp.getName())
//                .forEach(name -> System.out.println(name));
//
//
//     System.out.println("-----------Parallel Stream but in ordered way---------------");
//
//     employees.parallelStream()
//             .map(emp -> emp.getName())
//             .forEachOrdered(name -> System.out.println(name));


//     long start = System.currentTimeMillis();
//
//     employees.parallelStream()
//             .map(emp -> emp.getName())
//             .forEach(name -> System.out.println(name));
//
//     long end = System.currentTimeMillis();
//
//     System.out.println("Time difference : "+(end-start));




        System.out.println("-----------Heavy Operation for larger dataset to check parallel stream performance---------------");


        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }

        long start = System.currentTimeMillis();

        numbers.parallelStream()
                .map(num -> heavyOperation(num))
                .collect(Collectors.toList());

        long end = System.currentTimeMillis();

        System.out.println("Time difference : " + (end - start));
    }

    private static Object heavyOperation(Integer num) {

        for (int i = 0; i < 1000; i++) {
            num = num * 31 + i;
        }
        return num;
    }

}
