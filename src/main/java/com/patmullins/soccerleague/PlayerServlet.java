package com.patmullins.soccerleague;


        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;

public class PlayerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Player vecObj = new Player();
        vecObj.add("Servlet to JSP communicating an object");
        request.setAttribute("name",vecObj);


        RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/PlayerEntered.jsp");
        reqDispatcher.forward(request,response);



    }

}
