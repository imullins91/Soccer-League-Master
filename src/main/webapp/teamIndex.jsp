<%@ page import="com.patmullins.soccerleague.domain.Team" %>
<%@ page import="com.patmullins.soccerleague.repository.PlayersRepositoryImpl" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.domain.Team"></jsp:useBean>
<html>
<head><LINK REL="stylesheet" HREF="layout.css" TYPE="text/css"></head>

<h2>You have successfully completed the registration</h2>

<body>
<p>
<%
    Team teamEntry = (Team) request.getAttribute("teamEntry");
%>
<table class = "center" border = '1' cellpadding = '5' width = "900">
    <tr>

        <td>Team Name: <%= teamEntry.getTeamName()%></td>
        <td>Competition Level: <%= teamEntry.getCompetitionLevel()%></td>
        <td>Team City: <%= teamEntry.getTeamCity()%></td

    </tr>
</table>
</p>

</body>

</html>

