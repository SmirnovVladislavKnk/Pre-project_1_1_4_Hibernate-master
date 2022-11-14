package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Util.getSessionFactory();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Adam", "Ivanov", (byte) 22);
        userService.saveUser("Vladislav", "Smirnov", (byte) 22);
        userService.saveUser("Vladislav", "Vanin", (byte) 23);
        userService.saveUser("Anonim", "Anonimus", (byte) 33);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
