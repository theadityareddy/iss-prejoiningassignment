package com.aditya.auth.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.setAttribute("regUser", request.getParameter("username"));
        session.setAttribute("regPass", request.getParameter("password"));

        response.sendRedirect("login.jsp");
    }
}
