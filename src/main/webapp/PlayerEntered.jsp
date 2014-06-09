<HTML>
<BODY>
<jsp:useBean id="PlayerServlet" class="com.patmullins.soccerleague.PlayerServlet" scope="session"/>

You entered<BR>
Player Name: <%= com.patmullins.soccerleague.PlayerServlet.getName() %><BR>
Player Position: <%= com.patmullins.soccerleague.PlayerServlet.getPosition() %><BR>
Jersey Number: <%= com.patmullins.soccerleague.PlayerServlet.getJersey() %><BR>

</BODY>
</HTML>