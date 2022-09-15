package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("James", "Gosling", (byte) 67);
        userService.saveUser("Herbert", "Schildt", (byte) 71);
        userService.saveUser("Joshua", "Bloch", (byte) 61);
        userService.saveUser("Bruce", "Eckel", (byte) 65);

        System.out.println("--------------");

        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
