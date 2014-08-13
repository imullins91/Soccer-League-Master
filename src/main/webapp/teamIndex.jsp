<%@ page import="com.patmullins.soccerleague.domain.Team" %>
<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.domain.Team"></jsp:useBean>
<html>
<head>
    <LINK REL="stylesheet" HREF="layout.css" TYPE="text/css">
</head>

<body>

<ul id="nav">
    <center>
        <li><a href="HomePage.jsp">Home</a></li>
        <li><a href="PlayerInfo.jsp">Player Registration</a></li>
        <li><a href="TeamInfo.jsp">Team Registration</a></li>
    </center>
</ul>
<%
    Team teamEntry = (Team) request.getAttribute("teamEntry");
%>

<p>Team registration is now completed. Please review your entered information.<br>
<br>
<b>Team Name:</b> <%= teamEntry.getTeamName()%><br>
<b>Competition Level:</b> <%= teamEntry.getCompetitionLevel()%><br>
<b>Team City:</b> <%= teamEntry.getTeamCity()%>
</p>

</body>
</html>
