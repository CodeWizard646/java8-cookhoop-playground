package coreJavaQandA.java8Practice01.parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Amit", "IT", 70000),
//                new Employee("Sneha", "Finance", 80000),
//                new Employee("Vikram", "Finance", 750000),
//                new Employee("Pooja", "HR", 60000),
//                new Employee("Arjun", "IT", 950000),
//                new Employee("Kavya", "Marketing", 650000),
//                new Employee("Rohit", "Marketing", 72000),
//                new Employee("Anjali", "HR", 58000)));

//         long start = System.currentTimeMillis();
//         employees.stream()
//                .map((emp) -> emp.getName())
//                .forEach(name -> System.out.println(name));
//         long end  = System.currentTimeMillis();

//         System.out.println("execution time taken by single thread : " +(end - start));

//        long start = System.currentTimeMillis();
//           employees.parallelStream()
//                .map(emp -> emp.getName())
//                .forEachOrdered(name -> System.out.println(name));
//        long end  = System.currentTimeMillis();
//
//        System.out.println("execution time taken by multiple thread : " +(end - start));


//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 0 ;i<100000 ; i++){
//            list.add(i);
//        }
//
//        long start = System.currentTimeMillis();
//        list.parallelStream()
//                .map(num -> heavyOperation(num))
//                .collect(Collectors.toList());
//        long end = System.currentTimeMillis();
//
//        System.out.println("Total taken time by multiple thread : " +(end-start));
//    }
//
//    private static int heavyOperation(int num){
//
//        for(int i = 1 ; i< 1000 ; i++){
//            num = num*31+i;
//        }
//        return num;


//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 1 ; i<=1000 ; i++){
//            list.add(i);
//        }
//
//
//        List<Integer> squares = list.parallelStream()
//                .map(num ->  num*num)
//                .collect(Collectors.toList());
//
//        System.out.println(squares.size());

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

//        numbers.parallelStream()
//                .forEach(num-> System.out.println(Thread.currentThread().getName()));

        ForkJoinPool customThread = new ForkJoinPool(4);

        customThread.submit(()->{
            numbers.parallelStream()
                    .forEach(num-> System.out.println(Thread.currentThread().getName()));
        });

        customThread.shutdown();
        customThread.awaitTermination(4, TimeUnit.SECONDS);
    }
}
