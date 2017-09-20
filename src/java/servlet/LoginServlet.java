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
import service_class.UserService;

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
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        boolean isLoginSuccessful = false;
        boolean isUserPassword = false;
        UserService verifyLogin = new UserService();
        
        isLoginSuccessful = verifyLogin.login(username, password);
           
        if(isLoginSuccessful)
        {
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
        }
        else if(!isLoginSuccessful)
        {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("errorMessage", "Invalid user or password ");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
           
        }
        
        // TODO
    }
}
