package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;



public class Main {
    public static void main(String[] args) {

        UserDao userDaoJDBC = new UserDaoHibernateImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("dffd", "wdsgwe", (byte) 12);
        userDaoJDBC.dropUsersTable();

    }
}
