<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%

String firstName = (String) request.getParameter("firstName");
out.println("<br>Your first name is:" + firstName + "</br>");

String lastName = (String) request.getParameter("lastName");
out.println("<br>Your last name is:" + lastName + "</br>");

String position = (String) request.getParameter("position");
out.println("<br>The position you selected is:" + position + "</br>");

String jerseyNo = (String) request.getParameter("jerseyNo");
out.println("<br>Your jersey Number is: " + jerseyNo + "</br>");
%>
</body>
</html>

