


<%@ page import="com.patmullins.soccerleague.Player" %>
<HTML>
<BODY>

<%
    String message = (String) request.getAttribute("message");
    out.println("Servlet communicated message to JSP: "+ message);

    Player vecObj = (Player) request.getAttribute("name");
    out.println("Servlet to JSP communication of an object: "+vecObj.get(0));
%>

<%--You entered<BR>
Player Name: <%= Player.getName() %><BR>
Player Position: <%= Player.getPosition() %><BR>
Jersey Number: <%= Player.getJersey() %><BR>
--%>
</BODY>
</HTML>