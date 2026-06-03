package java8features.staticMethods;

public class Upi implements Payment {

    @Override
    public void pay() {
        System.out.println("Upi Payment implementation");
    }

    @Override
    public void refund() {
        System.out.println("Upi Payment implementation");
    }
}
