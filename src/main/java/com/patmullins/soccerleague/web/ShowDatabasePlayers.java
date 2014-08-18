package com.patmullins.soccerleague.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowDatabasePlayers extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter printWriter = res.getWriter();
        Connection connection;
        Statement statement;
        ResultSet resultSet;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:3693/Players", "postgres", "arsenal");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from Players");

            while (resultSet.next()) {
                printWriter.println("Name" + " " + resultSet.getString(2) + " " + resultSet.getString(3) + "<br>");
                printWriter.println("Position" + " " + resultSet.getString(4) + "<br>");
                printWriter.println("Country" + " " + resultSet.getString(5) + "<br>");
                printWriter.println("Jersey" + " " + resultSet.getString(6) + "<br>" + "<br>");
            }
        } catch (Exception e) {
            printWriter.println(e);
        }
    }
}
