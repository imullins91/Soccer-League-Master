package com.patmullins.soccerleague;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PlayerServlet extends HttpServlet{

        public void doGet(HttpServletRequest request,
                          HttpServletResponse response)
                throws ServletException, IOException {
        }
        public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);


            }
        }