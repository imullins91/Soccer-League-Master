<HTML>

<HEAD><LINK REL="stylesheet" HREF="layout.css" TYPE="text/css"></HEAD>
    <TITLE> Des Moines Soccer League </TITLE>
<BODY>
<h1>
     Des Moines Soccer League
</h1>
<p>
Please enter your information below
</p>
<form method="post" action="${pageContext.request.contextPath}/TeamServlet">

    <center>
        <label for="teamName">Team Name:</label><input type="text" id="teamName" name="teamName"/><br>
        <label for="competitionLevel">Competition Level:</label><select id="competitionLevel" name="competitionLevel"><option></option><option>Premier</option><option>2nd Division</option><option>3rd Division</option><option>CoEd</option></select><br>
        <label for="teamCity">Team City:</label><input type="text" select id="teamCity" name="teamCity"/><br>
        <input type="submit" value="Submit">
    </center>
</form>
</BODY>
</HTML>
