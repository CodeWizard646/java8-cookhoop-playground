package java8features.staticMethods;

public class NetBanking implements Payment {
    @Override
    public void pay() {
        System.out.println("NetBanking Payment implementation");
    }

    @Override
    public void refund() {
        System.out.println("NetBanking Payment implementation");
    }

    public boolean isValidAmount(int amount){  // this is method hidding not overridding
        return true;
    }
}
