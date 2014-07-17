<%@ page import="com.patmullins.soccerleague.Player" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.Player"></jsp:useBean>


<html>
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

</html>
