package java8features.functionalInterface.methodReference.staticMethodReference;

public class MainClass {

    public static void main(String[] args){

        // 1. implementation using lambda reference

        System.out.println("=============Example - 01========================");


        Calculator calculator1 = (a, b)-> {
            return a+b;
        };
        System.out.println(calculator1.calculate(10,10));

        System.out.println("=====================================");

        Calculator calculator2 = (a,b)-> {
            return MathOperations.add(a,b);
        };
        System.out.println(calculator2.calculate(10,10));

        System.out.println("=====================================");


        // 3. implementation using method reference

        Calculator calculator3 = MathOperations::add;
        System.out.println(calculator3.calculate(10,10));


        System.out.println("=============Example - 02========================");

        Calculator calculator4 = (a,b) -> {

            return a*b;
        };
        System.out.println(calculator4.calculate(2,5));


        System.out.println("=====================================");


        Calculator calculator5 = MathOperations::multiply;
        System.out.println("Method call using M.R. " +calculator5.calculate(2,5));


    }

}
