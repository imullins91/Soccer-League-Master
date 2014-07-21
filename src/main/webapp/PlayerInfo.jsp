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
<form method="post" action="/PlayerServlet">

    <center>
        <label for="firstName">First Name:</label><input type="text" id="firstName" name="firstName"/>
        <label for="lastName">Last Name:</label><input type="text" id="lastName" name="lastName"/><br>
        <label for="position">Position:</label><input type="text" id="position" name="position"/><br>
        <label for="jersey">Jersey No:</label><input type="number" id="jersey" name="jersey" min="0" max="99"/><br>
        <label for="country">Country:</label><select id="country" name="country"><option></option><option>USA</option><option>Mexico</option></select><br>
        <input type="submit" value="Submit">
    </center>
</form>
</BODY>
</HTML>