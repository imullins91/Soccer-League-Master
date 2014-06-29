package com.patmullins.soccerleague;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");

        Player messi = new Player();

        messi.setName(firstName);

        request.setAttribute("Messi", messi);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/index.jsp");
        view.forward(request,response);

    }
}