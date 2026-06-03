package java8features.functionalInterface.otherFunctionalInterfaces;

// yes! this is functional interface but it is user defined functional interface
// now will study about predefined Functional interface

// these are some predefined functional interfaces
//1.  Consumer Functional interface
//2. Supplier Functional interface
//3. Predicate Functional interface
//4. Function Functional interface

@FunctionalInterface
public interface Greeting {

    void greet();
}
