<jsp:useBean id="player" scope="request" class="com.patmullins.soccerleague.domain.Player"></jsp:useBean>

<html>
<head>
    <LINK REL="stylesheet" HREF="layout.css" TYPE="text/css">
</head>

<ul id="nav">
    <center>
        <li><a href="HomePage.jsp">Home</a></li>
        <li><a href="PlayerInfo.jsp">Player Registration</a></li>
        <li><a href="TeamInfo.jsp">Team Registration</a></li>
    </center>
</ul>
<body>
<%
    com.patmullins.soccerleague.domain.Player playerEntry = (com.patmullins.soccerleague.domain.Player) request.getAttribute("playerEntry");
%>

<p>Player registration is now completed. Please review your entered information.<br>
    <br>
    <b>Player Name:</b> <%= playerEntry.getFirstName() + " " + playerEntry.getLastName()%><br>
    <b>Position:</b> <%= playerEntry.getPosition()%><br>
    <b>Country:</b> <%= playerEntry.getCountry()%><br>
    <b>Jersey:</b> <%= playerEntry.getJersey()%>
</p>
</body>

</html>

