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
        p.setPosition( request.getParameter("position"));


        getServletConfig().getServletContext().getRequestDispatcher("/PlayerEntered.jsp").forward(request, response);

    }

}
