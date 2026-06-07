package coreJavaQandA.streamAPI;



import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.*;

public class Main {

    public static void main(String[] args)
    {
//        Predicate<Integer> p1 = num -> num%2 == 0;
//
//        Function<Integer , Integer> f1 = num -> num*num;
//
//        Consumer<Integer> c1 = num -> System.out.println(num);
//
//        Supplier<Integer> s1 = () -> (int)Math.random();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

//        Stream<Integer> stream = list.stream();

        // forEach(--Consumer, void accept(T t)-----)
//        stream.forEach((elem) -> System.out.println(elem));

//        list.stream().filter((num)-> num%2==0)
//                .forEach((elem) -> System.out.println(elem));

//        list.stream().filter((elem) -> elem%2 == 0)
//                .map((num)-> num*num)
//                .forEach((elem)-> System.out.println(elem));



        List<Employee> employees = Arrays.asList(
                new Employee(1,"Amit","Tech"),
                new Employee(2,"Neha","HR"),
                new Employee(3,"Rahul","Tech"),
                new Employee(4,"Priya","Finance"),
                new Employee(5,"Vikas","Tech"),
                new Employee(6,"Sneha","Marketing"),
                new Employee(7,"Arjun","Tech"));



//        employees.stream()
//                .filter((emp)->emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                .forEach((name)-> System.out.println(name));

//        List<String> tech = employees.stream()
//                .filter((emp) -> emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                .collect(Collectors.toList());


//        Set<String> tech1 = employees.stream()
//                .filter((emp) -> emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                .collect(Collectors.toSet());


        Function<Employee , Integer> f1 = (emp) -> emp.getId();
        Function<Employee , String> f2 = (emp) -> emp.getName();


        Map<Integer, String> collect = employees.stream()
                .collect(Collectors.toMap(f1, f2));

//        System.out.println(collect);

        
//        employees.stream()
//                .filter((emp)->emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                .forEach((name)-> System.out.println(name));



        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));


//          list1.stream()
//                  .filter( elem -> {
//                      System.out.println("We are inside filter method .");
//                      if(elem%2 == 0){
//                          return true;
//                      }else{
//                          return false;
//                      }
//                  })
//                  .map(elem -> {
//                      System.out.println("We are inside map method .");
//                      return elem*elem;
//                  })
//                  .collect(Collectors.toList());



          List<String> names = new ArrayList<>(Arrays.asList("Aman","Raj","Rohit",
                  "Riya","Rahul","Ankit","Rina","Reshma"));

//        Optional<String> first = names.stream()
//                .filter((n) -> n.startsWith("R"))
////                .findFirst()
//                .findAny();
//
//        System.out.println(first.get());

//        boolean r = names.stream()
//                .anyMatch((n) -> n.startsWith("Z"));
//
//        System.out.println(r);


//        List<Integer> unsorted = new ArrayList<>(Arrays.asList(3,2,-2,45,21,17));
//
//        unsorted.stream()
//                .sorted()
//                .forEach((num) -> System.out.println(num));


//        IntStream intStream = IntStream.range(1,5);
//        int sum = intStream.sum();
//        System.out.println(sum);
//
//        DoubleStream doubleStream = DoubleStream.of(2.3,4.5,7.1);
//        System.out.println(doubleStream.average().getAsDouble());
//
//        LongStream longStream = LongStream.of(1,2,4);


        System.out.println("---------------------Parallel Stream-------------------------");

        List<String> parallelStream = new ArrayList<>(Arrays.asList("Aman","Raj","Rohit",
                "Riya","Rahul","Ankit","Rina","Reshma"));

        parallelStream.parallelStream()
                .filter((str)-> str.startsWith("R"))
                .forEach((name) -> System.out.println(name));

    }
}
