package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDate;

class BookOrderTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void testOrder(){
        BookOrder bookOrder = new BookOrder();
        bookOrder.setOrderDate(LocalDate.now());
        bookOrder.setCustomer(em.find(Customer.class,1));
        bookOrder.setPaymentMethod("Visa");
        bookOrder.setRecipientName(em.find(Customer.class,1).getFullName());
        bookOrder.setShippingAddress(em.find(Customer.class,1).getAddress());
        bookOrder.setStatus("open");
        bookOrder.setTotal(new BigDecimal(24.99));
        bookOrder.setRecipientPhone(em.find(Customer.class,1).getPhone());

        tx.begin();
        em.persist(bookOrder);
        tx.commit();
    }
}