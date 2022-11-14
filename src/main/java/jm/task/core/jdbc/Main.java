package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Util.getSessionFactory();
        UserDao userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Adam", "Ivanov", (byte) 22);
        userDaoHibernate.saveUser("Vladislav", "Smirnov", (byte) 22);
        userDaoHibernate.saveUser("Vladislav", "Vanin", (byte) 23);
        userDaoHibernate.saveUser("Anonim", "Anonimus", (byte) 33);
        userDaoHibernate.getAllUsers();
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}
