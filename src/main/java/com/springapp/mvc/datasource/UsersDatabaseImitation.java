package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UsersDatabaseImitation {
    private static List<User> listOfUsers = new ArrayList<>();

    static {
        listOfUsers.add(new User("Mila Bezaliuc", "endava", "Female"));
        listOfUsers.add(new User("Petru Covaliov", "endava", "Male"));
        listOfUsers.add(new User("Maxim Ustimov", "endava", "Male"));
        listOfUsers.add(new User("Ion Sandul", "endava", "Male"));
        listOfUsers.add(new User("Ivan Sirosenco", "endava", "Male"));
        listOfUsers.add(new User("Iulia Muraseva", "endava", "Female"));
        listOfUsers.add(new User("Elvira Parpalac", "endava", "Female"));
        listOfUsers.add(new User("Iuliana Corotcova", "endava", "Female"));
        listOfUsers.add(new User("Egor Guzun", "endava", "Male"));
    }

    public static List<User> getListOfUsers() {
        return listOfUsers;
    }

    public static void setListOfUsers(List<User> listOfUsers) {
        UsersDatabaseImitation.listOfUsers = listOfUsers;
    }

    public static List<User> getListOfMaleUsers() {
        return listOfUsers.stream().filter(User::isMale).collect(Collectors.toList());
    }

    public static List<User> getListOfFemaleUsers() {
        return listOfUsers.stream().filter(user -> !user.isMale()).collect(Collectors.toList());
    }
}
