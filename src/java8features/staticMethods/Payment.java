package java8features.staticMethods;

import java.util.Date;

public interface Payment {

    void pay();
    void refund();

   static boolean isValidAmount(int amount){
        logTime();
        if(amount>0){
            return true;
        }
        return false;
    }

    static void logTime(){
//        isDefaultMethod();  // we can call default method or any other normal method from static area
       System.out.println(new Date());

    }

    default boolean isDefaultMethod(){
       return true;
    }
}
