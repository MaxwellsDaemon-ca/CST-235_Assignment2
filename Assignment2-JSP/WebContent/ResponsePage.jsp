<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello <%=request.getAttribute("firstname")%></title>
</head>
<body>

Hello <%=request.getAttribute("firstname")%>. <br>
It appears that your last name is <%=request.getAttribute("lastname")%>.<br> 
I hope you have a nice day.

</body>
</html>