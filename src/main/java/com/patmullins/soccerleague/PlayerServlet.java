package com.patmullins.soccerleague;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PlayerServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String name = HttpServletRequest.getParameter("name");
        String position = HttpServletRequest.getParameter("position");
        String jersey = HttpServletRequest.getParameter("jersey");

        request.setAttribute("name", name);
        request.setAttribute("position", position);
        request.setAttribute("jersey", jersey);

        RequestDispacher rd = request.getRequestDispacher("/PlayerInfo.jsp");
        rd.forward(request,response);
    }
}





            // Player P = new Player();
            // request.setAttribute("name",P);

            // String name= request.getParameter("name");
            // String position= request.getParameter("position");

            // request.setAttribute("name", name);
            // request.setAttribute("position", position);




