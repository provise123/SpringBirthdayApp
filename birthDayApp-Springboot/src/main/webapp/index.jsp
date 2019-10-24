<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Employee Info</b>

	<form action="addEmployee">
	EmployeeID:-
		<input type="text" name="empId">
		<br>
	FirstName:- 	
		<input type="text" name="firstName">
		<br>
	LastName:-	
		<input type="text" name="lastName">
		<br>
	DateOfBirth:-	
		<input type="text" name="DOB">
		<br>
	EmailAddress:- 	
		<input type="text" name="emailAddress">
		<br>
		<input type="submit" value="addEmployee">
	</form>
<br>
<br>
<form action="getEmployee">
<br>
<input type="text" name="DOB">
<br>
<input type="submit" value="EmployeeList">

</form>

</body>
</html>