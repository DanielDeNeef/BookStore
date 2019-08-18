package com.bookstore.service;

import com.bookstore.entity.Users;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesTest {

    UserServices userServices = new UserServices();

    @Test
    void testUserServcie(){
        List<Users> usersList = userServices.listUser();
        usersList.forEach(users -> System.out.println(users.getFullName()));
    }

}