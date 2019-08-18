package com.bookstore.dao;

import com.bookstore.entity.Users;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDao<Users> implements GenericDAO <Users> {

    public UserDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public Users create(Users user){
        return super.create(user);
    }

    @Override
    public Users read(Object userId) {
        return super.find(Users.class,userId);
    }

    @Override
    public Users update(Users users) {
        return super.update(users);
    }

    @Override
    public void delete(Object userid) {
        super.delete(Users.class,userid);
    }

    @Override
    public List<Users> listAll() {
        return super.findWithNamedQuery("Users.findAll");
    }

    @Override
    public long count() {
        return super.countWithNamedQuery("Users.countAll");
    }
}
