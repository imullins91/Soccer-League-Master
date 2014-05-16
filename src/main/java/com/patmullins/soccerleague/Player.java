package com.patmullins.soccerleague;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Player extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    {

        String name = request.getParameter("name");
        String position = request.getParameter("position");
        String jersey = request.getParameter("jersey");

        request.getRequestDispatcher("Player");
        rd.forward(request, response);

    }
}