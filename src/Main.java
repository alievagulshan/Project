import company.model.User;
import company.servis.impl.UserServiceimpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      User user1 = new User(1, "Gulshan", 31, "male");
      User user2 = new User(2, "Asan", 12, "male");
      User user3 = new User(3, "Gulu", 18, "female");
      User user4 = new User(4, "Uson", 40, "male");
      UserServiceimpl userServiceimpl = new UserServiceimpl();
      userServiceimpl.addUser(user1);
      userServiceimpl.addUser(user2);
      userServiceimpl.addUser(user3);
      try {
        userServiceimpl.addUser(user4);

        System.out.println("id menen tabylgandar");
        System.out.println(userServiceimpl.findById(1));
        System.out.println("baardyk userler");
        userServiceimpl.getAllUser();

        userServiceimpl.deleteById(2);
        System.out.println("ochurulgondon kiyinki user");
        userServiceimpl.getAllUser();

      }catch (MyException a){
        System.out.println(a.getMessage());
      }


    }
}