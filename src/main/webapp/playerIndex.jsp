<%@ page import="com.patmullins.soccerleague.domain.Player" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.domain.Player"></jsp:useBean>

<link href="css/bootstrap.min.css" rel="stylesheet">
<html>
<head><LINK REL="stylesheet" HREF="layout.css" TYPE="text/css"></head>

<h2>You have successfully completed the registration</h2>

<body>
<p>
<%
    com.patmullins.soccerleague.domain.Player playerEntry = (com.patmullins.soccerleague.domain.Player) request.getAttribute("playerEntry");
%>
<table class = "center" border = '1' cellpadding = '5' width = "900">
    <tr>

        <td>Player Name: <%= playerEntry.getFirstName() +" " + playerEntry.getLastName()%></td>
        <td>Position: <%= playerEntry.getPosition()%></td>
        <td>Country: <%= playerEntry.getCountry()%></td>
        <td>Jersey: <%= playerEntry.getJersey()%></td>
</tr>
</table>
</p>

<script src="https://code.jquery.com/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
</body>

</html>

