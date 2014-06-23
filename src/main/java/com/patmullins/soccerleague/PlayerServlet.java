package com.patmullins.soccerleague;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;

public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        Player messi = new Player();
        messi.setName("Messi");
        RequestDispatcher rd = request.getRequestDispatcher("PlayerInfo.jsp");
        rd.forward(request, response);
        String name = "firstName";
        messi.setName(request.getParameter(name));

//        PrintWriter out = response.getWriter();
//        out.println("<h1>DSM Soccer League Information: </h1>");
//        out.println("<b><BR>Player has entered: </b>");
//        out.println("<BR>First Name: " + request.getParameter("firstName"));
//        out.println("<BR>Last Name: " + request.getParameter("lastName"));
//        out.println("<BR>Preferred Position: " + request.getParameter("position"));
//        out.println("<BR>Jersey No: " + request.getParameter("jersey"));
    }
}
