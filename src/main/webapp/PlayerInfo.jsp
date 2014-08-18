<HTML>
<link rel="stylesheet" type="text/css" href="layout.css">
<TITLE> Des Moines Soccer League </TITLE>

<BODY>
<h1>Des Moines Soccer League</h1>
<ul class="nav">
    <center>
        <li><a href="HomePage.jsp">Home</a></li>
        <li class="active"><a href="PlayerInfo.jsp">Player Registration</a></li>
        <li><a href="TeamInfo.jsp">Team Registration</a></li>
    </center>
</ul>
<p>
    Please enter your information below
</p>

<form method="post" action="${pageContext.request.contextPath}/PlayerServlet">
    <center>
        <label for="firstName">First Name:</label><input type="text" id="firstName" name="firstName"/><br>
        <label for="lastName">Last Name:</label><input type="text" id="lastName" name="lastName"/><br>
        <label for="position">Position:</label><select id="position" name="position"/><br>
        <option></option>
        <option>GK</option>
        <option>LB</option>
        <option>LWB</option>
        <option>CB</option>
        <option>RB</option>
        <option>RWB</option>
        <option>CDM</option>
        <option>LM</option>
        <option>CM</option>
        <option>RM</option>
        <option>CAM</option>
        <option>LW</option>
        <option>RW</option>
        <option>CF</option>
        </select></br>
        <label for="jersey">Jersey No:</label><input type="number" id="jersey" name="jersey" min="0" max="99"/><br>
        <label for="country">Country:</label><select id="country" name="country">
        <option></option>
        <option>United States</option>
        <option>Mexico</option>
        <option>Canada</option>
        <option>Germany</option>
        <option>Spain</option>
        <option>Italy</option>
        <option>France</option>
        <option>Brazil</option>
    </select><br>
        <input type="submit" value="Submit">
    </center>
</form>
<hr>
<div class="footer">
    <p>&copy; Mullins 2014</p>
</div>
</BODY>
</HTML>
