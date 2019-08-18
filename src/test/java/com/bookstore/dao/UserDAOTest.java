package com.bookstore.dao;

import com.bookstore.entity.Users;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    UserDAO userDAO = new UserDAO(em);

    @Test
    void testCreateUser() {
        Users users2 = new Users();
        users2.setFullName("Christa");
        users2.setPassword("95432");
        users2.setEmail("Christa@mail.com");

        users2 = userDAO.create(users2);

        assertTrue(users2.getUserId()>0);
    }

    @Test
    void testCreateUsersFieldsNotSet(){
        Users users = new Users();

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

        users=userDAO.update(users);

        assertEquals("mia", users.getFullName());
    }

    @Test
    void testGetUsersFound(){
        Integer userId= 2;
        Users users = userDAO.read(userId);

        assertNotNull(users);
    }

    @Test
    void testUserNotFound(){
        Integer userid = 1;
        Users users = userDAO.read(userid);

        assertNull(users);
    }

    @Test
    void testDeleteUser(){
        Integer userid = 2;
        userDAO.delete(userid);

        Users users = userDAO.read(userid);
        assertNull(users);
    }

    @Test
    void testDeleteNonExistUser(){
        Integer userid = 2;

        Assertions.assertThrows(EntityNotFoundException.class, ()->{
            userDAO.delete(userid);
        });
    }

    @Test
    void testListAll(){
        List<Users> usersList = userDAO.listAll();

        usersList.forEach(users -> System.out.println(users.getFullName()));

        assertTrue(usersList.size()>0);
    }

    @Test
    void testCountusers(){
        Long userCount = userDAO.count();
        assertEquals(3,userCount);
    }
}