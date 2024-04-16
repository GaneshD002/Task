package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;

@WebServlet("/req2")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve user inputs from the login form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Check if the provided email and password match the database
        User user = new UserDao().getUserByEmail(email);

        if (user != null && user.getUpassword().equals(password)) {
            // If login successful, redirect to first.jsp
            request.getRequestDispatcher("first.jsp").forward(request, response);
        } else {
            // If login fails, redirect to error.jsp
            response.sendRedirect("error.jsp");
        }
    }
}
