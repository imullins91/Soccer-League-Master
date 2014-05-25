<%@ page import="java.io.IOException" %>
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<%!
    public class Player extends HttpServlet {
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            {

                String name = request.getParameter("name");
                String position = request.getParameter("position");
                String jersey = request.getParameter("jersey");

                request.getRequestDispatcher("Player").forward(request, response);
            }
        }
    }
%>

<html>
<body>
<CENTER>
    <H1>Player Information</H1>
    <form  method="post" action="Player">
        Your name:
        <INPUT TYPE="text" NAME="name">
        <BR>
        <BR>
        Jersey Number:
        <INPUT TYPE="text" NAME="jersey">
        <BR>
        Preferred Position:
        <INPUT TYPE="text" NAME="position">
        <BR>
        <BR>
        <INPUT TYPE="submit" VALUE="Submit"><INPUT TYPE="RESET" VALUE="Reset">
    </FORM>
</CENTER>
</form>
</body>
</html>