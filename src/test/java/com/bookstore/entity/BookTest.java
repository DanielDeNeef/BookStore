package com.bookstore.entity;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    @Test
    void checkBookEntity(){

        Book arryPotter = new Book();
        arryPotter.setAuthor("william blim blam blom");
        arryPotter.setCategory(new Category("Fantasy"));
        arryPotter.setDescription("a book of the wizzard arraypotter that can make magic with lists");
        arryPotter.setLastUpdatedOn(LocalDate.now());
        arryPotter.setPublishDate(LocalDate.of(2005,03,13));
        arryPotter.setPrice(new BigDecimal(24.99));
        arryPotter.setIsbn("123456789");
        arryPotter.setImage(new byte[]{2,5,6,8,7,10});
        arryPotter.setTitle("array and the secret of HashSets");

        tx.begin();
        em.persist(arryPotter);
        tx.commit();
    }

}