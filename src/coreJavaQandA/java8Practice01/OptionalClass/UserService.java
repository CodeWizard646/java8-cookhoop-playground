package coreJavaQandA.java8Practice01.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {

    public Optional<User> getByUserId(int id)
    {
     List<User> users =   Arrays.asList(new User(1,"Rahul") ,
                new User(2,"Amit"),
                new User(3,"Neha"));

        for(User user : users)
        {
               if(user.getId() == id)
               {
                   return Optional.of(user);
               }

        }
        return Optional.empty();  // user not found return null
    }
}
