package com.patmullins.soccerleague;

<jsp:useBean id="user" class="com.patmullins.soccerleague.Player" scope="session"/>
<HTML>
<BODY>
You entered<BR>
Player Name: <%= user.getName() %><BR>
Player Position: <%= user.getPosition() %><BR>
Jersey Number: <%= user.getJersey() %><BR>
</BODY>
</HTML>