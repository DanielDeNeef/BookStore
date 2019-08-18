package com.bookstore.dao;

import javax.persistence.*;
import java.util.List;

public class JpaDao <E>{

    protected EntityManager em;


    public JpaDao(EntityManager entityManager) {
        this.em = entityManager;
    }

    public E create(E entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.refresh(entity);
        em.getTransaction().commit();
        return entity;
    }

    public E update(E entity){
        em.getTransaction().begin();
        entity =  em.merge(entity);
        em.getTransaction().commit();
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
        em.getTransaction().begin();
        Object reference = em.getReference(type,id);
        em.remove(reference);
        em.getTransaction().commit();
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
