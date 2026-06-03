package java8features.defaultMethods.diamondProblem;

public interface Calculator {

    default int calculate(int a, int b){
        return a+b;
    }
}
