package com.bookstore.dao;

import java.util.List;

public interface GenericDAO <T>{

    /**
     * this interface will use the database CRUD
     */

    T create(T t);
    T read(Object id);
    T update(T t);
    void delete(Object id);
    List<T> listAll();
    long count();

}
