/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service_class.User;

/**
 *
 * @author Administrator
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = request.getParameter("successMessage");
        request.setAttribute("successMessage", message);

        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "";
        String message = "";

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if (user.getUsername().equals("") || user.getPassword().equals("")) {
            message = "Both values required!";
            request.setAttribute("username", user.getUsername());
            request.setAttribute("password", user.getPassword());
            request.setAttribute("errorMessage", message);
            url = "/WEB-INF/index.jsp";
        } else if (user.getUsername().equals("adam") && user.getPassword().equals("password")) {
            request.setAttribute("username", user.getUsername());
            request.setAttribute("successMessage", message);
            url = "/WEB-INF/mainPage.jsp";
        } 
        else if (user.getUsername().equals("betty") && user.getPassword().equals("password")) {
            request.setAttribute("username", user.getUsername());
            request.setAttribute("successMessage", message);
            url = "/WEB-INF/mainPage.jsp";
        }
        else {
            message = "invalid username or password";
            request.setAttribute("username", user.getUsername());
            request.setAttribute("password", user.getPassword());
            request.setAttribute("errorMessage", message);
            url = "/WEB-INF/index.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(request, response);

    }
}
