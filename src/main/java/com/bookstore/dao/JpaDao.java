package com.bookstore.dao;

import javax.persistence.*;
import java.util.List;

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

    public E find(Class<E> type, Object id){
       E entity = em.find(type, id);
       if (entity !=null) {
           em.refresh(entity);
       }
       return entity;
    }

    public void delete(Class<E> type,Object id){
        tx.begin();
        Object reference = em.getReference(type,id);
        em.remove(reference);
        tx.commit();
    }

    public List<E> findWithNamedQuery(String queryName){
        Query query = em.createNamedQuery(queryName);
        return query.getResultList();
    }

    public Long countWithNamedQuery(String queryName){
        Query query = em.createNamedQuery(queryName);
        return (long) query.getSingleResult();
    }
 }
