package com.bookstore.dao;

import com.bookstore.entity.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Test
    void testCreateUser() {
        Users users2 = new Users();
        users2.setFullName("daniel");
        users2.setPassword("5555");
        users2.setEmail("daniel@mail.com");

        UserDAO userDAO = new UserDAO();
        users2 = userDAO.create(users2);

        assertTrue(users2.getUserId()>0);
    }

    @Test
    void testCreateUsersFieldsNotSet(){
        Users users = new Users();
        UserDAO userDAO = new UserDAO();
        Assertions.assertThrows(PersistenceException.class, ()->{
            userDAO.create(users);
        });
    }

    @Test
    void testUpdateUsers(){
        Users users = new Users();
        users.setUserId(2);
        users.setEmail("namecode@java.net");
        users.setFullName("mia");
        users.setPassword("99999");

        UserDAO userDAO = new UserDAO();
        users=userDAO.update(users);

        assertEquals("mia", users.getFullName());
    }
}