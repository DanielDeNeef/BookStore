package com.bookstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaDao <E>{

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookstore");
    protected EntityManager em = emf.createEntityManager();
    protected EntityTransaction tx = em.getTransaction();

    public JpaDao() {
    }

    public E create(E entity){
        tx.begin();
        em.persist(entity);
        em.flush();
        em.refresh(entity);
        tx.commit();
        return entity;
    }

    public E update(E entity){
        tx.begin();
        entity =  em.merge(entity);
        tx.commit();
        return entity;
    }
}
