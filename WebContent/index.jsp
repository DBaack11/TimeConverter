<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the Time Converter</title>

<script type="text/javascript">
	function validate(){
		var secondsVar = seconds.userSeconds.value.trim();
		var minutesVar = minutes.userMinutes.value.trim();
		
		if(secondsVar == "" && minutesVar == ""){
			alert("Must enter a value for seconds or minutes.")
			return false;
		}
		 
		if(isNaN(secondsVar) || isNaN(minutesVar)){
			alert("Must enter a numeric value.")
			return false;
		} 
		
		return(true);
	}


</script>


<link rel="stylesheet" type="text/css" href="css_stylesheet.css">
</head>
<center>
<body>
	<h1>Time Converter</h1>
<form action="getSecondsServlet" method="post" name="seconds" onsubmit="return(validate());">
<h2><b><u>ENTER NUMBER OF SECONDS IN A WHOLE NUMBER:</u></b><br><br>
<input type="text" name="userSeconds" size="20"><br><br>
<input type="submit" value="Convert Seconds" class="click button"/></h2>
</form>

<br>

<form action="getMinutesServlet" method="post" name="minutes" onsubmit="return(validate());">
<h2><b><u>ENTER NUMBER OF MINUTES IN A WHOLE NUMBER:</u></b><br><br>
<input type="text" name="userMinutes" size="20"><br><br>
<input type="submit" value="Convert Minutes" class="click button"/></h2>
</form>

</body>
</center>
</html>