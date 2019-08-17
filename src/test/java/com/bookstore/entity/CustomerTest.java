package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void testCustomer(){
        Customer bob = new Customer();
        bob.setAddress("rue de droite");
        bob.setCity("brussels");
        bob.setCountry("belgium");
        bob.setEmail("bob@mail.com");
        bob.setFullName("bob the lob");
        bob.setPassword("123");
        bob.setPhone("123 45 67 89");
        bob.setRegisterDate(LocalDate.now());
        bob.setZipcode("1070");

        tx.begin();
        em.persist(bob);
        tx.commit();


    }

}