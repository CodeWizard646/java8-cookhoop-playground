package java8features.top20StreamsQnA;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args){


        System.out.println("===========Q-1=========================");

        // Q1) Given a list of integers, remove duplicates
        // and sort them into a descending order.

        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,1,3,2,5,4));

        // 1 - Way

//        Stream<Integer> sorted = list.stream().distinct()
//                                 .sorted((a, b) -> b - a);
//
//                sorted.forEach(num->System.out.print(num));

       // 2 - Way

//        List<Integer> collect = list.stream().distinct().sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        System.out.println("================Q-2====================");


        //Q2) From list of integers, find all the odd numbers
        // and return their square

//        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        List<Integer> collect1 = list1.stream().filter(num -> num % 2 != 0)
//                .map((num) -> num * num).collect(Collectors.toList());
//
//        System.out.println(collect1);

        System.out.println("================Q-3====================");

        //Q3 We have list of integers. Get 2nd and 3rd elements from it
        // and return them in a list.

//        List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
//
//        List<Integer> collect = list2.stream()
//                .skip(1)
//                .limit(2)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);


        System.out.println("================Q-4====================");

        //Q4 Find the second highest number of the list.

//        List<Integer> list3 = new ArrayList<>(Arrays.asList(20,10,10,45,30,45,5,20));
//
//        Optional<Integer> first = list3.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//
//        if(first.isPresent()) {
//            System.out.println(first.get());
//        }


        System.out.println("================Q-5====================");


        //Q5 You have a list of integers. Divide numbers into even and odd.

//        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//
//        Map<Boolean, List<Integer>> collect = list5.stream()
//                .collect(Collectors.partitioningBy(elem -> elem % 2 == 0));
//
//        System.out.println(collect);



        System.out.println("================Q-6====================");

        //Q6. you have a  list of Strings. find the longest string in a list.

//        List<String> list6 = new ArrayList<>(Arrays.asList("Java","SpringBoot","API"));
//
//        Optional<String> result = list6.stream()
//                .max(Comparator.comparing(elem -> elem.length()));
//
//        if(result.isPresent()){
//            System.out.println(result.get());
//        }

        System.out.println("================Q-7====================");

        //Q7. From a list of employees, find the first employee
        // whose salary is greater than 50000

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
//        List<Employee> collect = employees.stream()
//                .sorted(Comparator.comparingInt(emp -> -1 * emp.getSalary()))
//                .limit(2)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        System.out.println("================Q-8====================");

        //Q-8 From a list of Employees , sort employees by salary, then by name.


//        List<Employee> employees = new ArrayList<>(Arrays.asList(
//                new Employee("Abhishek","IT",50000),
//                new Employee("Ankit","IT",70000),
//                new Employee("Rahul","HR",40000),
//                new Employee("Tina","HR",45000),
//                new Employee("Esha","Finance",60000),
//                new Employee("Naman","Finance",55000),
//                new Employee("Sachit","IT",80000),
//                new Employee("Pushp","Marketing",50000),
//                new Employee("Sumit","Marketing",52000),
//                new Employee("DiSkha","HR",45000),
//                new Employee("Rohan","Finance",60000)
//
//        ));
//
//        List<Employee> collect = employees.stream()
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
//        System.out.print(collect);


        System.out.println("================Q-10====================");

        //Q10) From a list of Integer, Find the Frequency of each element in a list.

//        List<Integer> list10 = Arrays.asList(3,2,3,4,4,1,2,1,1,1,5,6,5);
//
//        Map<Integer, Long> collect1 = list10.stream()
//                .collect(Collectors.groupingBy(elem -> elem,
//                        Collectors.counting()));
//
//        System.out.print(collect1);


        System.out.println("================Q-11====================");

        //Q11) Given a list of employees,
        // count how many employees are in each department.

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
//        Map<String, Long> collect = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.counting()));
//
//        System.out.println(collect);


        System.out.println("================Q-12====================");

        //Q12 Given a list of transactions, find total transaction amount per category.

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
//        Map<String, Integer> collect = transactions.stream()
//                .collect(Collectors.groupingBy(transaction -> transaction.getCategory(),
//                        Collectors.summingInt(txn -> txn.getAmount())));
//
//        System.out.println(collect);


        System.out.println("================Q-13====================");

        //Q13) Given a list of Employees,
        // Find the average salary of employees in each department.

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
//
//        Map<String, Double> collect = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.averagingInt(emp -> emp.getSalary())));
//
//        System.out.println(collect);


        System.out.println("================Q-14====================");

        //Q14) Given a list of employees,
        // find the highest paid employee in each department.

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
//        Map<String, Optional<Employee>> collect = employees.stream()
//                .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
//                        Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));
//
//        System.out.println(collect);


        System.out.println("================Q-15====================");

        //Q15) Given a list of employees,
        //convert the list into a comma-separated string of Employee names


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
//        String collect = employees.stream()
//                .map(emp -> emp.getName())
//                .collect(Collectors.joining(","));
//
//        System.out.println(collect);


        System.out.println("================Q-16====================");

        //Q16) Given two lists, find the common elements between them.

//        List<Integer> list1 = Arrays.asList(1,2,3,4);
//        List<Integer> list2 = Arrays.asList(3,4,5,6);

//        List<Integer> collect = list2.stream()
//                .filter(elem -> list1.contains(elem))
//                .collect(Collectors.toList());

//        Set<Integer> set = new HashSet<>(list1);
//
//        List<Integer> collect1 = list2.stream()
//                .filter(elem -> set.contains(elem))
//                .collect(Collectors.toList());
//
//        System.out.println(collect1);


        System.out.println("================Q-17====================");

        //Q17) you have a list of lists.
        // convert it into single list with all the elements. remove duplicate if any.

//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1,2,3,4),
//                Arrays.asList(3,4,5,6),
//                Arrays.asList(7,8,1,2),
//                Arrays.asList(9,10,5,6),
//                Arrays.asList(11,12,7,8)
//        );
//
//        List<Integer> collect = listOfLists.stream()
//                .flatMap(integerList -> integerList.stream())
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(collect);


        System.out.println("================Q-18====================");

        //Q18) Given a list of employees, Print all employees names.
        // Their order doesn't matter but the operations should be very fast.

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
//                employees.parallelStream()
//                        .map(emp->emp.getName())
//                        .forEach(name -> System.out.println(name));


        System.out.println("================Q-19====================");



    









        System.out.println("================Q-20====================");

        //Q20) From a list of Employees,
        // Compute total combined salary of all the employees.
        // Operations should be very fast.

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

        Integer result = employees.parallelStream()
                .map(emp -> emp.getSalary())
                .reduce(0, (a, b) -> a + b);

        System.out.println("Total salary of all Employees: " +result);


    }
}
