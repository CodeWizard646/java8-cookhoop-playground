package java8features.functionalInterface.methodReference.instanceMethodReference;

public class MainClass {

    public static void main(String[] args){


        // 1 . Instance Method Reference (Of a particular object)
        //  it is used when we are calling an instance method of some class using it's object

        System.out.println("===============Example - 01================================");

        MathOperations m1 = new MathOperations();

        Validator v1 = (num) -> {
            return m1.isPositive(num);
        };

        System.out.println(v1.validate(10));
        System.out.println(v1.validate(-2));


        System.out.println("======Instance Method Reference of a particular object=====");

        Validator v2 = m1::isPositive;

        System.out.println(v2.validate(20));
        System.out.println(v2.validate(-2));


        // 2. Instance Method Reference (of an arbitrary object)
        // it is used when we are calling an instance method on an object that is passed as an argument.

        System.out.println("======Instance Method Reference (of arbitrary Object)=====");

        StringOperations s1 = (str) -> {
            return str.length();
        };

        System.out.println(s1.operate("Sudhanshu"));

        System.out.println("=========================================");

        StringOperations s2 = String::length;

        System.out.println(s2.operate("Sudhanshu"));


        System.out.println("=========================================");

        StringOperations s3 = (str)->{
            return str.hashCode();
        };
        System.out.println(s3.operate("Sameeskha"));


        StringOperations s4 = String::hashCode;
        System.out.println(s4.operate("Sameeskha"));

    }
}
