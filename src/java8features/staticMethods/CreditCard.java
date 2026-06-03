package java8features.staticMethods;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("CC pay payment implementation");
    }

    @Override
    public void refund() {
        System.out.println("CC refund payment implementation");
    }
}
