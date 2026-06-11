package coreJavaQandA.java8Practice01.streamAPI;

import java8features.streamAPI.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
//        Predicate<Integer> p1 = (num) -> num%2 == 0;
//        p1.test(10);
//
//        Function<Integer , Integer> f1 = (num) -> num*num;
//        f1.apply(10);
//
//        Consumer<Integer> c1 = (num) -> System.out.println(" Consumer consume : ");
//        c1.accept(10);
//
//        Supplier<Integer> s1 = () -> (int) Math.random();
//        s1.get();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

//       list.stream().forEach((elem) -> System.out.println(elem));

//        list.stream()
//                .filter((elem) -> elem%2 == 0)
//                .forEach((elem) -> System.out.println(elem));

//        list.stream()
//                .filter((elem)-> elem%2 == 0)
//                .map((elem) -> elem*elem)
//                .forEach((elem) -> System.out.println(elem));



        List<Employee> employees = Arrays.asList(
                new Employee(1,"Amit","Tech"),
                new Employee(2,"Neha","HR"),
                new Employee(3,"Rahul","Tech"),
                new Employee(4,"Priya","Finance"),
                new Employee(5,"Vikas","Tech"),
                new Employee(6,"Sneha","Marketing"),
                new Employee(7,"Arjun","Tech")
        );

        System.out.println("-------------Converting list into a Map-------------------");
//
//        Function<Employee, String> f1 = (emp) -> emp.getName();
//        Function<Employee, Integer> f2 = (emp) -> emp.getId();
//
//        Map<Integer, String> collect = employees.stream()
//                .collect(Collectors.toMap(f2, f1));
//
//        System.out.println(collect);

        System.out.println("-------------Int manupulation data-------------------");

        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,2,-2,45,21,17));

        List<Integer> collect = list1.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
