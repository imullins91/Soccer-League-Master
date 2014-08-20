<%@ page import="java.util.List" %>
<%@ page import="com.patmullins.soccerleague.domain.Player" %>
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
    List<Player> players = (List<Player>)request.getAttribute("players");
%>
        <% for(Player player : players) { %>
    <h2><%=player.getFirstName() %></h2>
    <h2><%=player.getLastName() %></h2>
    <h2><%=player.getPosition() %></h2>
    <h2><%=player.getCountry() %></h2>
    <h2><%=player.getJersey() %></h2>
<% } %>
</body>

</html>

