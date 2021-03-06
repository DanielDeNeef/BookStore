package com.bookstore.service;

import com.bookstore.dao.UserDAO;
import com.bookstore.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServices {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private UserDAO userDAO;
    private HttpServletRequest request;
    private HttpServletResponse response;

    public UserServices(HttpServletRequest request,HttpServletResponse response) {
        this.request = request;
        this.response = response;
        entityManagerFactory = Persistence.createEntityManagerFactory("bookstore");
        entityManager = entityManagerFactory.createEntityManager();
        userDAO = new UserDAO(entityManager);
    }

    public void listUser() throws ServletException, IOException {
        listUser(null);
    }

    public void listUser(String message) throws ServletException, IOException {
        List<Users> listUsers= userDAO.listAll();

        request.setAttribute("listUsers",listUsers);

        if (message!=null) {
            request.setAttribute("message", message);
        }

        String listPage="user_list.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

        requestDispatcher.forward(request,response);
    }

    public void createUser(){
        String email = request.getParameter("email");
        String fullName = request.getParameter("fullname");
        String password = request.getParameter("password");

        Users newUsser = new Users(email,fullName,password);
        userDAO.create(newUsser);
    }
}
