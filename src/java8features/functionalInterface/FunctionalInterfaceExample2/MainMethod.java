package java8features.functionalInterface.FunctionalInterfaceExample2;

public class MainMethod {

    public static  void main(String[] args){
//
//         Calculator calculator = () -> System.out.println("Calculate any sum of two numbers ");
//         calculator.calculate();

         Greeting greeting = () -> System.out.println("Greet you teacher when you reached to your class!!");
         greeting.greet();

         Task task = () -> System.out.println("execute this task one by one ");
         task.execute();

         Tea tea = () -> System.out.println("I had tea in the morning");
         tea.takeTea();

        Square square =number -> number * number;
        System.out.println(square.doSquare(5));

        Calculator calculator = (num1,num2) -> num1+num2;

        System.out.println("Sum of two number is " +calculator.calculate(10,10));
    }
}
