package java8features.optionalClass;

import java.util.Optional;

public class MainClass {

    public static void main(String[] args){

        UserService userService = new UserService();
        Optional<User> userOptional = userService.getUserById(5);

        System.out.println("========================================================");

//        if(userOptional.isPresent()) {
//            User user = userOptional.get();
//            System.out.println("Name : " + user.getName() + "Id : " + user.getId());
//        }

        System.out.println("========================================================");


        //ifPresent() method executes a given action only if the value is present
//
//        Consumer<User> c1 = (user)-> {
//            System.out.println("Name : " + user.getName() + " Id : " + user.getId());
//        };
//        c1.accept(userOptional.get());

//        userOptional.ifPresent((user) -> System.out.println("Name : " + user.getName() + " Id : " + user.getId()));


        System.out.println("========================================================");

        //orElse() method returns the value ifPresent, otherwise returns a default value

//        User user = userOptional.orElse(new User(-1, "default User"));
//
//        System.out.println("Name : " + user.getName() + " Id : " + user.getId());


        System.out.println("========================================================");

        //orElseGet() method returns the value if present, otherwise calls a supplier to generate the default value.


//        Supplier<User> s1 = () -> new User(-1,"default User");
//        s1.get();


//        User user = userOptional.orElseGet(()-> new User(-1, "default User"));
//        System.out.println("Name : " + user.getName() + " Id : " + user.getId());


        System.out.println("========================================================");


        //orElseThrow() method returns the value if present, otherwise throws an exception.

//        User user = userOptional.orElseThrow(() -> new RuntimeException("User not found"));
//        System.out.println("User : " +user.getName() + " Id + " +user.getId());


        System.out.println("========================================================");

        //ofNullable() method:-
        // it is Optional class's method which creates an Optional that holds the value
        // if it's non-null, otherwise returns an empty Optional

        User user = null;
//      Optional.of(user); // it will through NPE

        Optional.ofNullable(user);//it lets value enter into the Optional only if user!=null
    }
}

