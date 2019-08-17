package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

class ReviewTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void testReview(){
        Review review = new Review();
        review.setBookId(em.find(Book.class,1));
        review.setCustomerId(em.find(Customer.class,1));
        review.setComment("nice book ");
        review.setRating(4);
        review.setHeadline("readed the book");
        review.setReviewOn(LocalDate.now());

        tx.begin();
        em.persist(review);
        tx.commit();
    }

}