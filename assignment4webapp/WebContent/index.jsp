<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hi</title>
</head>
<body>
    <form action="MyServlet" method="post">
        First Name <input type="text" id="first" name="first"><br><br>
        Last Name &nbsp;<input type="text" id="last" name="first"><br><br>
        Student Id &nbsp;&nbsp;<input type="text" id="sid" name="sid"><br><br>
        Telephone &nbsp;&nbsp;<input type="tel" id="telephone" name="telephone"><br><br>
        Address <textarea rows="3" cols="50" id="address" name="address"></textarea><br><br>
        <input type="submit" value="submit">
    </form>
</body>
</html>