<HTML>

<HEAD>
    <LINK REL="stylesheet" HREF="layout.css" TYPE="text/css">
</HEAD>
<TITLE> Des Moines Soccer League </TITLE>

<BODY>

<h1>
    Des Moines Soccer League
</h1>
<ul id="nav">
    <center>
        <li><a href="HomePage.jsp">Home</a></li>
        <li><a href="PlayerInfo.jsp">Player Registration</a></li>
        <li class="active"><a href="TeamInfo.jsp">Team Registration</a></li>
    </center>
</ul>
<p>
    Please enter your information below
</p>

<form method="post" action="${pageContext.request.contextPath}/TeamServlet">

    <center>
        <label for="teamName">Team Name:</label><input type="text" id="teamName" name="teamName"/><br>
        <label for="competitionLevel">Competition Level:</label><select id="competitionLevel" name="competitionLevel">
        <option></option>
        <option>Premier</option>
        <option>2nd Division</option>
        <option>3rd Division</option>
        <option>Coed</option>
    </select><br>
        <label for="teamCity">Team City:</label><input type="text" select id="teamCity" name="teamCity"/><br>
        <input type="submit" value="Submit">

    </center>
</form>
<hr>
<div class="footer">
    <p>&copy; Mullins 2014</p>
</div>
</BODY>
</HTML>
