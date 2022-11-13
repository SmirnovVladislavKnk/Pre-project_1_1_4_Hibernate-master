package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Adam", "Ivanov", (byte) 22);
        userDao.saveUser("Vladislav", "Smirnov", (byte) 22);
        userDao.saveUser("Vladislav", "Vanin", (byte) 23);
        userDao.saveUser("Anonim", "Anonimus", (byte) 33);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
