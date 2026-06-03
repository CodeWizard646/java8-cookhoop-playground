package java8features.optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserService {

    public Optional<User> getUserById(int id){

        List<User> users = Arrays.asList(new User(1,"Sudhanshu"),
                                         new User(2,"Nekata"),
                                         new User(3,"Kalyan"),
                                         new User(4,"Shivani"));

        for(User user : users){
            if(user.getId() == id){
                return Optional.of(user);
            }
        }
        return Optional.empty(); //  user not found

    }
}
