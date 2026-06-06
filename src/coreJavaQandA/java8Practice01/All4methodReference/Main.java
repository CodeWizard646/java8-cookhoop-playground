package coreJavaQandA.java8Practice01.All4methodReference;

public class Main {
    public static void main(String[] args){

        System.out.println("----------------static method Reference--------------");

        Calculator c1 = (a,b) -> {
            return MathOperations.add(a,b);
        };
        System.out.println(c1.calculate(10,20));


        Calculator c2 = MathOperations::add;

        System.out.println(c2.calculate(10,20));


//        Calculator c3 = (a ,b) -> {
//            return MathOperations.multiply(a,b);
//        };

        Calculator c3 = MathOperations::multiply;

        System.out.println(c3.calculate(2,4));


        System.out.println("----------------instance method Reference(of a particular object)--------------");


        MathOperations mathOperations = new MathOperations();
//        Validator v1 = (num) -> {
//            return mathOperations.isPositive(num);
//        };

        Validator v1 = mathOperations::isPositive;
        System.out.println(v1.validate(10));
        System.out.println(v1.validate(-10));


        System.out.println("----------------instance method Reference(of an arbitrary object)--------------");

        StringOperations s1 = (str) -> {
             return str.length();
        };
        System.out.println(s1.operate("Sudhanshu"));


        // str variable's ClassName we will call like String::length()
        StringOperations s2 = String::length;
        System.out.println(s2.operate("Sudhanshu"));

        StringOperations s3 = (str) -> {
            return str.hashCode();
        };
        System.out.println(s3.operate("Sudhanshu"));


        StringOperations s4 =  String::hashCode;
        System.out.println(s4.operate("Sudhanshu"));


        System.out.println("----------------Constructor method Reference--------------");

        Creator<User> user1 = (name) -> {
          return new User(name);
        };

        User u1 = user1.create("sudhanshu");
        System.out.println(u1.name);


        Creator<User> user2 = User::new;
        System.out.println("User::New : " +u1.name);



        Creator<Product> p1 = (product ) -> {
                 return new Product(product);
        };

        Product appleWatch = p1.create("Apple watch");
        System.out.println(appleWatch.productName);
    }
}
