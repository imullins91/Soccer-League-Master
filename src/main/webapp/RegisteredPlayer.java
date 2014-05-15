package com.patmullins.soccerleague;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisteredPlayer extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    {

        String position = request.getParameter("position");
        String name = request.getParameter("name");
        String jersey = request.getParameter("jersey");


        ServletContext context = getServletContext();
        String path = context.getRealPath("/WEB-INF/Players.txt");

    }
}