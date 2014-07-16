
package com.patmullins.soccerleague;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Player messi = new Player();
        messi.setName(request.getParameter("name"));
        messi.setPosition(request.getParameter("position"));
        messi.setCountry(request.getParameter("country"));

        request.setAttribute("messi", messi);

        RequestDispatcher view = getServletContext().getRequestDispatcher("/index.jsp");
        view.forward(request, response);

    }

}
