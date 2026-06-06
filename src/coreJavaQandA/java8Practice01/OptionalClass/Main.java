package coreJavaQandA.java8Practice01.OptionalClass;


import java.util.Optional;


public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        Optional<User> user = userService.getByUserId(3);

//        if(user.isPresent()) {
//            User user1 = user.get();
//            System.out.println("Name : " + user1.getName() + " Id : " + user1.getId());
//        }

//        user.ifPresent(user1 -> System.out.println("Name : " + user1.getName() + " Id : " + user1.getId()));

//        User user2 = user.orElse(new User(-1, "Default User"));
//        System.out.println("Name : " + user2.getName() + " Id : " + user2.getId());\

//        User user2 = user.orElseGet(() -> new User(-1, "Default User"));
//        System.out.println("Name : " + user2.getName() + " Id : " + user2.getId());

//      user.orElseThrow(()-> new RuntimeException("User not found"));

//        user.orElseThrow(() -> new RuntimeException("Default User"));

        User user4 = null;

//        Optional.of(user4);
        Optional.ofNullable(user4);
    }
}
