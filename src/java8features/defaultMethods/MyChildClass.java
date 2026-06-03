package java8features.defaultMethods;

public class MyChildClass implements MyInterface {

    @Override
    public void print() {
        System.out.println("This is the default implementation of default method of Interface.");
    }
}
