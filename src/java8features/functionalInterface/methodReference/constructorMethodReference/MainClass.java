package java8features.functionalInterface.methodReference.constructorMethodReference;

public class MainClass {

    public static void main(String[] args){

        // Constructor Method Reference :-
        // it is used when we are calling a constructor to create a new object

        System.out.println("============User==============");

        Creator<User> s1 = (name)->{
            return new User(name);
        };
        User u1 = s1.create("Sudhanshu");
        System.out.println(u1.name);


        System.out.println("===================================");

        Creator<User> s2 = User::new;  // Constructor method reference.
        User u2 = s2.create("Sudhanshu");
        System.out.println(u2.name);

        System.out.println("=================Product==================");

        Creator<Product> s3 = (name)-> {
            return new Product(name);
        };
        Product product = s3.create("Apple watch");
        System.out.println(product.productName);

        System.out.println("===================================");

        Creator<Product> s4 = Product::new;
        Product product1 = s4.create("I-phone");

        System.out.println(product1.productName);


    }
}
