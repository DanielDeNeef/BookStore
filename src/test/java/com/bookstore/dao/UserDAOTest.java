package com.bookstore.dao;

import com.bookstore.entity.Users;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Test
    void testCreateUser() {
        Users users2 = new Users();
        users2.setFullName("Mia");
        users2.setPassword("1111");
        users2.setEmail("Mia@mail.com");

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

    @Test
    void testGetUsersFound(){
        Integer userId= 2;
        UserDAO userDAO = new UserDAO();
        Users users = userDAO.read(userId);

        assertNotNull(users);
    }

    @Test
    void testUserNotFound(){
        Integer userid = 1;
        UserDAO userDAO = new UserDAO();
        Users users = userDAO.read(userid);

        assertNull(users);
    }

    @Test
    void testDeleteUser(){
        Integer userid = 2;
        UserDAO userDAO= new UserDAO();
        userDAO.delete(userid);

        Users users = userDAO.read(userid);
        assertNull(users);
    }

    @Test
    void testDeleteNonExistUser(){
        Integer userid = 2;
        UserDAO userDAO= new UserDAO();

        Assertions.assertThrows(EntityNotFoundException.class, ()->{
            userDAO.delete(userid);
        });
    }

    @Test
    void testListAll(){
        UserDAO userDAO=new UserDAO();
        List<Users> usersList = userDAO.listAll();

        usersList.forEach(users -> System.out.println(users.getFullName()));

        assertTrue(usersList.size()>0);
    }

    @Test
    void testCountusers(){
        UserDAO userDAO = new UserDAO();
        Long userCount = userDAO.count();
        assertEquals(3,userCount);
    }
}