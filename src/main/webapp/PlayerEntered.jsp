

<%@ page import="com.patmullins.soccerleague.PlayerServlet" %>
<HTML>
<BODY>
<%
    PlayerServlet viewModel = (PlayerServlet) request.getAttribute("playerServlet");
    pageContext.setAttribute("player", player);
%>%>

You entered<BR>
Player Name: <%= user.getName() %><BR>
Player Position: <%= user.getPosition() %><BR>
Jersey Number: <%= user.getJersey() %><BR>
</BODY>
</HTML>