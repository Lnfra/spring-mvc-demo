<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<!-- Upon load form will get values from student-->
	<!-- Upon submit form will set value to student-->
		
	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName" />
	<br><br>
	
	Last Name: <form:input path="lastName" />
	<br><br>
	
	<input type="submit" value="Submit" /
	>
	
	</form:form>

</body>
</html>