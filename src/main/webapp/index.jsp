<%@ page import="com.patmullins.soccerleague.Player" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.Player"></jsp:useBean>


<html>
<<<<<<< HEAD
<head><LINK REL="stylesheet" HREF="layout.css" TYPE="text/css"></head>

<h2>You have successfully completed the registration</h2>

<body>
<p>
<%
    Player playerEntry = (Player) request.getAttribute("playerEntry");
%>
<table class = "center" border = '1' cellpadding = '5' width = "900">
    <tr>

    <td>Name: <%= playerEntry.getName()%></td>
    <td>Position: <%= playerEntry.getPosition()%></td>
    <td>Country: <%= playerEntry.getCountry()%></td>
</tr>
</table>
</p>

</body>
=======
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
>>>>>>> 7667d496d254527ad0a97db36fa65d8c1062df4e

</html>
