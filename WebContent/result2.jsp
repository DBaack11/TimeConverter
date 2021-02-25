<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Minutes Time Conversion</title>
</head>
<body>
<p><strong><h1><u>${userConversion.getMinutes()} minute(s) is equivalent to: </u></h1></strong><br />
	<font size="+3">${userConversion.getSeconds()} seconds </font><br />
	OR <br>
	<font size="+3">${userConversion.getHours()} hours </font><br />
	OR <br>
	<font size="+3">${userConversion.getDays()} days </font><br />
	OR<br>
	<font size="+3">${userConversion.getMonths()} months </font><br />
	OR <br>
	<font size="+3">${userConversion.getYears()} years </font><br />
</p>
<a href="index.jsp">Select another amount of time.</a>

</body>
</html>