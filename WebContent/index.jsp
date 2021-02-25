<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the Seconds Time Converter</title>
</head>
<body>
	<h1>Time Converter</h1>
<form action="getSecondsServlet" method="post">
Enter the number of seconds in a whole number:
<input type="text" name="userSeconds" size="20">
<input type="submit" value="Convert Seconds" />
</form>

<form action="getMinutesServlet" method="post">
Enter the number of minutes in a whole number:
<input type="text" name="userMinutes" size="20">
<input type="submit" value="Convert Minutes" />
</form>

</body>
</html>