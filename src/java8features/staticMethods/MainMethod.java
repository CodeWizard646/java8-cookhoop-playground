package java8features.staticMethods;

public class MainMethod {

    public static void  main(String[] args){

        CreditCard cc = new CreditCard();

        cc.pay();
        cc.refund();

//        cc.isValidAmount(); //  not possible

//        CreditCard.isValidAmount();  // even can't call using CreditCard class name

         Payment.isValidAmount(10); // in this way we can call static methods of interface by interface name only.

        System.out.println("Static methods can be invoked like this " +Payment.isValidAmount(10));
    }
}
