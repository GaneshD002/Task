package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.User;

@WebServlet(value="/req1")
public class FirstServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("a1").equalsIgnoreCase("Register"))
        {
            User u1 = new User();
            u1.setUname(req.getParameter("uname"));
            u1.setUemail(req.getParameter("uemail"));
            u1.setUpassword(req.getParameter("upassword"));
            int check = new UserDao().insertUser(u1);
			if(check>0)
				try {
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			else
				try {
					resp.sendRedirect("error.jsp");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }
    }
}
