package java8features.functionalInterface.otherFunctionalInterfaces;

import java8features.functionalInterface.FunctionalInterfaceExample2.Greeting;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass {

    // these are some predefined functional interfaces
//1.  Consumer Functional interface
//2. Supplier Functional interface
//3. Predicate Functional interface
//4. Function Functional interface


    public static void main(String[] args) {

        // User defined Functional interface

        Greeting g = () -> {
            System.out.println("Hello, Good Morning bachhho!!!");
        };
        g.greet();

        System.out.println("====================================");

        //1. Predicate Functional interface

        Predicate<Integer> p1 = (num) -> {
            if(num%2==0){
                return true;
            }else {
                return false;
            }
        };
        
        System.out.println(p1.test(10));
        System.out.println(p1.test(25));


        System.out.println("====================================");

        Predicate<String> str1 = (str) -> {
            if(str.isEmpty()){
                return true;
            }else{
                return false;
            }
        };

        System.out.println(str1.test(""));
        System.out.println(str1.test("sudhanshu"));


        //4. Function Functional interface

        System.out.println("====================================");

        Function<String, Integer> f1 = (str) -> {
            return str.length();
        };

        System.out.println(f1.apply("Sudhanshu"));

        System.out.println("====================================");


        Function<Integer, Integer> num1 = (num) -> {
            return num*num;
        };
        System.out.println(num1.apply(2));


        //1.  Consumer Functional interface

        System.out.println("====================================");

        Consumer<String> c1 = (name) -> {

            System.out.println("My name is " + name);
        };
        c1.accept("sudhanshu");

        System.out.println("====================================");

        Consumer<Integer> c2 = (number) -> {
            System.out.println("My age is " +number);
        };
        c2.accept(22);

        //2. Supplier Functional interface

        System.out.println("====================================");

        Supplier<Integer> s1 = () -> {
            return (int) Math.random();

        };
        System.out.println(s1.get());

        System.out.println("====================================");

        Supplier<String> s2 = () -> {
          String a = "Sudhanshu";
          String b = "Yadav";
          return a+b;
        };

        System.out.println(s2.get());
    }
}

