<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>
	<h4>List of students</h4>
	<table>
		<thead></thead>
		<tbody>

			<tr>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<c:forEach var="tempSdata" items="${sdatas}">
				<c:url var="updatelink" value="/updateSdata">
					<c:param name="id" value="${tempStudent.id}" />
				</c:url>

				<c:url var="deletelink" value="/deleteSdata">
					<c:param name="id" value="${tempStudent.id}" />
				</c:url>

				<tr>
					<td>${tempSdata.name}</td>
					<td>${tempSdata.snumber}</td>
					<td><a href="${updatelink}">Update</a> | <a
						href="${deletelink}"
						onclick="if(!(confirm('Are you sure you want to delete this Student?'))) return false">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<a href="showsaveSdata">Add SData </a>
</body>
</html>