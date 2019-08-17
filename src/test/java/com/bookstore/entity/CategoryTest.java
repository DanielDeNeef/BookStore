package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void testCategory(){
        Category category = new Category();
        category.setName("Action");

        tx.begin();
        em.persist(category);
        tx.commit();

    }

}