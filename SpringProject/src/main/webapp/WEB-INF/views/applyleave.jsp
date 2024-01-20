<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Apply leave page</h1>
<form action="insert" method="post" >
Empno       :<input type="number" name="empno" value="811234" readonly>
<br>
Start Date  :<input type="date" name="start"  id="start">
<br>
End Date    :<input type="date" name="end"  id="end">
<br>
Leave type  :<select name="type" id="type">
<option value="Earned leave ">Earned Leave</option>
<option value="Loss of pay">Loss of Pay</option>
</select>
<br>
Leave Reason:<select name="reason" id="reason">
<option value="personal">personal</option>
<option value="Sick">Sick</option>
<option value="Ritual">Ritual</option>
<option value="Out of station">Out Of Station</option>
</select>
<br>
<button type="submit">Apply Leave</button>
</form>
</div>
</body>
</html>