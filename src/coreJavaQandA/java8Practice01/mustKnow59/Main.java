package coreJavaQandA.java8Practice01.mustKnow59;

import java8features.top20StreamsQnA.Employee;
import java8features.top20StreamsQnA.Transaction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        //1) Remove duplicate and sort them in descending order.

        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,1,3,2,5,4));

//        List<Integer> collect = list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());

        Set<Integer> collect = new TreeSet<>(list);

        //2) Find odd number and return their square.

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        List<Integer> collect1 = list1.stream()
//                .filter(elem -> elem % 2 != 0)
//                .map(elem -> elem * elem)
//                .collect(Collectors.toList());

//        System.out.println(collect1);

        //3) Get 2nd and 3rd elements from it and return them in list.

        List<Integer> list2 = Arrays.asList(10,20,30,40,50);

//        List<Integer> collect1 = list2.stream()
//                .skip(1)
//                .limit(2)
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);

        //4) Find the second highest number in the list

        List<Integer> list3 = Arrays.asList(20,10,10,45,30,45,4,20);

//        Optional<Integer> first = list3.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//
//        System.out.println(first.get());

        //5) Divide numbers into even and odd

        List<Integer> list4 = Arrays.asList(1,2,3,4,5);

//        Map<Boolean, List<Integer>> collect1 = list4.stream()
//                .collect(Collectors.groupingBy((elem) -> elem % 2 == 0));

//        Map<Boolean, List<Integer>> collect1 = list4.stream()
//                .collect(Collectors.partitioningBy((elem) -> elem % 2 == 0));
//
//        System.out.println(collect1);

        //6)Find the longest string from the list

//        List<String> list5 = Arrays.asList("Java","SpringBoot","API");
//
//        Optional<String> maxed = list5.stream()
//                .max(Comparator.comparing(elem -> elem.length()));
//
//        if(maxed.isPresent())
//        {
//            System.out.println(maxed.get());
//        }

        //7) Find the first employee whose salary is greater than 50000.

//                List<Employee> employees = new ArrayList<>(Arrays.asList(
//
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));

//        Optional<Employee> first = employees.stream()
//                .filter(emp -> emp.getSalary() > 50000)
//                .findFirst();
//
//        if(first.isPresent()) {
//            System.out.println(first.get());
//        }

        //8) Find top 2 the highest paid employee.

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//        List<Employee> collect2 = employees.stream()
//                .sorted(Comparator.comparingInt(emp -> -1 * emp.getSalary()))
//                .limit(2)
//                .collect(Collectors.toList());
//
//        System.out.println(collect2);

        //9) Sort employee by their salary then by their name

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//        List<Employee> sorted =  employees.stream()
//                .sorted((emp1, emp2) -> {
//                    if (emp1.getSalary() > emp2.getSalary()) {
//                        return 1;
//                    } else if (emp1.getSalary() < emp2.getSalary()) {
//                        return -1;
//                    } else {
//                        return emp1.getName().compareTo(emp2.getName());
//                    }
//                }).collect(Collectors.toList());
//
//
//        System.out.println(sorted);

        //10) find the frequency of each element in the list.

//        List<Integer> list5 = new ArrayList<>(Arrays.asList(3,2,3,4,4,1,2,1,1,1,5,6,5));
//
//        Map<Integer, Long> collect1 = list5.stream()
//                .collect(Collectors.groupingBy(elem -> elem, Collectors.counting()));
//
//        System.out.println(collect1);

        //11) Count How many employees are  in each department

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//        Map<String, Long> collect1 = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.counting()));
//
//        System.out.println(collect1);

        //12) find total Transaction per category.

//        List<Transaction> transactions = Arrays.asList(
//                new Transaction("Food",100),
//                new Transaction("Food",200),
//                new Transaction("Food",150),
//                new Transaction("Shopping",300),
//                new Transaction("Shopping",250),
//                new Transaction("Shopping",100),
//                new Transaction("Utilities",400),
//                new Transaction("Utilities",300),
//                new Transaction("Entertainment",500),
//                new Transaction("Entertainment",200),
//                new Transaction("Travel",700),
//                new Transaction("Travel",300)
//        );
//
//        /*transaction*/
//        Map<String, Integer> collect2 = transactions.stream()
//                .collect(Collectors.groupingBy(tx -> tx.getCategory(),
//                        Collectors.summingInt(tx -> tx.getAmount())));
//
//        System.out.println(collect2);


        //13 find average salary of employees in each department.

//                List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//
//        Map<String, Double> collect1 = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.averagingInt(emp -> emp.getSalary())));
//
//        System.out.println(collect1);

        //14 find the highest paid employee in each department.

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//        Map<String,Optional<Employee>> result = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));
//
//        System.out.println(result);

        //15 Convert the list into a comma-separated string of Employee names.

//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000)
//        ));
//
//        String collect2 = employees.stream()
//                .map(emp -> emp.getName())
//                .collect(Collectors.joining(","));
//
//        System.out.println(collect2);

        //16 Find common integer values.

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3,4,5,6));

        //1) First Approach.

//        List<Integer> collect1 = l1.stream()
//                .filter(elem -> l2.contains(elem))
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);

//        List<Integer> collect1 = l2.stream()
//                .filter(elem -> l1.contains(elem))
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);


        //2) Second Approach.

//        Set<Integer> set = new HashSet<>(l1);
//
//        List<Integer> collect1 = l2.stream()
//                .filter(elem -> set.contains(elem))
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);

        //17) Convert it into a single list with all the elements. and also remove duplicates.

//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1,2,3,4),
//                Arrays.asList(3,4,5,6),
//                Arrays.asList(7,8,1,2),
//                Arrays.asList(9,10,5,6),
//                Arrays.asList(11,12,7,8)
//        );
//
//        List<Integer> collect1 = listOfLists.stream()
//                .flatMap(lists -> lists.stream())
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);

        //20) Compute total combined salary of all the Employees, Operations should be very fast.

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Abhishek","IT",50000),
                new Employee("Ankit","IT",70000),
                new Employee("Rahul","HR",40000),
                new Employee("Tina","HR",45000),
                new Employee("Esha","Finance",60000),
                new Employee("Naman","Finance",55000),
                new Employee("Sachit","IT",80000),
                new Employee("Pushp","Marketing",50000),
                new Employee("Sumit","Marketing",52000)
        ));

        Integer reduce = employees.stream()
                .map(emp -> emp.getSalary())
                .reduce(0, (a, b) -> a + b);

        System.out.println("Final result : " +reduce);

    }

}
