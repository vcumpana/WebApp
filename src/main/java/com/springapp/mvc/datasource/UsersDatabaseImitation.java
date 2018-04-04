package com.springapp.mvc.datasource;

import com.springapp.mvc.model.Gender;
import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.springapp.mvc.model.Gender.*;

@Repository
public class UsersDatabaseImitation {

    private static List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", FEMALE));
        listOfUsers.add(new User("Petru Covaliov", "endava", MALE));
        listOfUsers.add(new User("Maxim Ustimov", "endava", MALE));
        listOfUsers.add(new User("Ion Sandul", "endava", MALE));
        listOfUsers.add(new User("Ivan Sirosenco", "endava", MALE));
        listOfUsers.add(new User("Iulia Muraseva", "endava", FEMALE));
        listOfUsers.add(new User("Elvira Parpalac", "endava", FEMALE));
        listOfUsers.add(new User("Iuliana Corotcova", "endava", FEMALE));
        listOfUsers.add(new User("Egor Guzun", "endava", MALE));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static List<User> getListOfUsersByGender(Gender gender) {
        switch (gender) {
            case MALE:
                return listOfUsers.stream().filter(User::isMale).collect(Collectors.toList());
            case FEMALE:
                return listOfUsers.stream().filter(user -> !user.isMale()).collect(Collectors.toList());
            default:
                return getListOfUsers();
        }
    }
}
