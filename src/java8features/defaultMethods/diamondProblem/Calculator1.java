package java8features.defaultMethods.diamondProblem;

public interface Calculator1 {

    default int calculate(int a , int b){
        return a*b;
    }
}
