package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    Users user1 = new Users();


    @Test
    void TestUserClass(){
        user1.setEmail("user2@usermail.com");
        user1.setFullName("Second User");
        user1.setPassword("5465651");

        tx.begin();
        em.persist(user1);
        tx.commit();
    }
}