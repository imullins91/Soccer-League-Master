<%@ page import="com.patmullins.soccerleague.Player" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.Player"></jsp:useBean>


<html>
<body>
<h3>You have successfully completed the registration</h3>

<%
    Player messi = (Player) request.getAttribute("messi");
%>
Name: <%= messi.getName()%><br>
Position: <%= messi.getPosition()%> <br>
Country: <%= messi.getCountry()%>
</body>

</html>

