package com.bookstore.dao;

import com.bookstore.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDao<Users> implements GenericDAO <Users> {

    public UserDAO() {
    }

    public Users create(Users user){
        return super.create(user);
    }

    @Override
    public Users read(Object id) {
        return null;
    }

    @Override
    public Users update(Users users) {
        return super.update(users);
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Users> listAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
