<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head></head>
<body>
	<form:form action="saveSdata" commandName="sdata">
		<form:hidden path="id" />
		<form:input path="name" />
		<form:input path="snumber" />
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>