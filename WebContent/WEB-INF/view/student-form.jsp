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
	
	Country: 
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	</form:select>
	<br><br>
	
	<!-- path will set value to favouriteLanguage setter -->
	<!-- items will populate radiobuttons from favoriteLanguageOptions hashmap -->
	Favorite Language:
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />				
	<br><br>
	
	Operating Systems:
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>

</body>
</html>
















