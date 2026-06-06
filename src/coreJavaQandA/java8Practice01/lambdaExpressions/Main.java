package coreJavaQandA.java8Practice01.lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args)
    {
//        Greeting g1 = () -> {
//            System.out.println("Hello  world Greeting ! ");
//        };
//        g1.greet();

        Predicate<Integer> p1 = (num) -> {
            if(num%2 == 0){
                return true;
            }else {
                return false;
            }
        };

        System.out.println(p1.test(20));
        System.out.println(p1.test(7));

        Predicate<String> p2 = (str) -> {
            if(str.isEmpty()){
                return true;
            }else{
                return false;
            }
        };
      System.out.println(p2.test(""));
      System.out.println(p2.test("sudhanshu"));

      System.out.println("-------------Function Functional interface----------------");

        Function<String , Integer> f1 = str -> str.length();
        System.out.println(f1.apply("sudhanshu"));

        Function<Integer , Integer> f2 = num -> num*num;
        System.out.println(f2.apply(10));


        Consumer<String> c1 = str -> System.out.println("My name is : " +str);
        c1.accept("Sudhanshu");

        Consumer<Integer> c2 = age -> System.out.println("My age is : " +age);
        c2.accept(22);

        Supplier<Integer> s1 = () -> {
            return (int) Math.random();
        };
        System.out.println(s1.get());

        Supplier<String> s2 = () -> {
            String a =  "Sudhanshu";
            String b = "yadav";
            return a.concat(b);
        };
        System.out.println(s2.get());
    }
}
