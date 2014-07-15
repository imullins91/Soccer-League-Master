
package com.patmullins.soccerleague;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PlayerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        Player player = new Player();

        player.setName(request.getParameter("Name"));
        request.setAttribute("playerName", player.getName());

        player.setPosition(request.getParameter("Position"));
        request.setAttribute("playerPosition", player.getPosition());

        player.setCountry(request.getParameter("Country"));
        request.setAttribute("playerCountry", player.getCountry());

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(request, response);

    }
}



