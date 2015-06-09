package com.epam.testsystem.servlet;

import com.epam.testsystem.dao.Jpa;
import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-value")
@RequestScoped
public class Servlet extends HttpServlet {
    @Inject
    @Jpa
    UserDao userDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();

        userDao.insert(user);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();

        userDao.insert(user);
    }
}
