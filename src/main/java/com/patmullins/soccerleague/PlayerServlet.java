package com.patmullins.soccerleague;

import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //communicating a simple String message.

        String name = "Example source code of Servlet to JSP communication.";

        request.setAttribute("messi", name);

        //communicating a Vector object

        Player messi = new Player();

        messi.getName();

        request.setAttribute("messi", name);

        //Servlet JSP communication

        RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");

        reqDispatcher.forward(request,response);

    }
}