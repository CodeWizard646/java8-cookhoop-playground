package java8features.functionalInterface;

@FunctionalInterface // it ensures that interface should behave like functional interface.
public interface MyInterface {
    void method1();

    default void method2(){

    }

    static void method3(){

    }
}
