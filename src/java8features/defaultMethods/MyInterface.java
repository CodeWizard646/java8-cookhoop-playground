package java8features.defaultMethods;

public interface MyInterface {

    default void print(){

        System.out.println("This is default method");
    }
}
