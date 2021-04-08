<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seconds Time Conversion</title>
<link rel="stylesheet" type="text/css" href="css_stylesheet.css">
</head>
<body>
<center>
<p><strong><h1><u>${userConversion.getSeconds()} second(s) is equivalent to: </u></h1></strong>
	<h3><font size="+3">${userConversion.getMinutes()} minutes </font></h3>
	<h2>OR</h2>
	<h3><font size="+3">${userConversion.getHours()} hours </font></h3>
	<h2>OR </h2>
	<h3><font size="+3">${userConversion.getDays()} days </font></h3>
	<h2>OR</h2>
	<h3><font size="+3">${userConversion.getMonths()} months </font></h3>
	<h2>OR</h2>
	<h3><font size="+3">${userConversion.getYears()} years </font></h3>
</p>
<br>

<a href="index.jsp" class="click button">NEW CALCULATION</a>
</center>
</body>
</html>