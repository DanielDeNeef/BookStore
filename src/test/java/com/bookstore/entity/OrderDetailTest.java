package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.math.BigDecimal;

class OrderDetailTest {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void testOrderDetails(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setBook(em.find(Book.class,1));
        orderDetail.setBookorder(em.find(BookOrder.class,1));
        orderDetail.setQuantity(2);
        orderDetail.setSubtotal(new BigDecimal(50));

        tx.begin();
        em.persist(orderDetail);
        tx.commit();
    }

}