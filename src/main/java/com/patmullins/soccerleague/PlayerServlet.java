package com.patmullins.soccerleague;


        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Player p = new Player();
        p.setName( request.getParameter("name"));

        response.getWriter().close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST Pat Mullins");

        response.getWriter().println("Jsp is linked with a post");
        response.getWriter().close();

    }

}
