package java8features.defaultMethods.diamondProblem;

public class CalculatorImpl implements Calculator,Calculator1{
    @Override
    public int calculate(int a, int b) {
        return Calculator1.super.calculate(a, b);
    }

    public static void main(String[] args)
    {
        CalculatorImpl calculator = new CalculatorImpl();

        System.out.println(calculator.calculate(10,20));
    }
}
