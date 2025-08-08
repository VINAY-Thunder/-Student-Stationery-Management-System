<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Item Details</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	padding: 30px;
}

table {
	border-collapse: collapse;
}

th, td {
	padding: 8px 12px;
}
</style>
</head>
<body>

	<h2>Enter Item Details</h2>

	<form:form action="/GeometryApp/saveItem" method="post" modelAttribute="boxes12">

		<%-- <form:hidden path="id" / --%>

		<table>
			<tr>
				<th>Shape</th>
				<td><form:input path="shape" required="true" /></td>
			</tr>

			<tr>
				<th>Colour</th>
				<td><form:input path="colour" required="true" /></td>
			</tr>

			<tr>
				<th>Brand</th>
				<td><form:input path="brand" required="true" /></td>
			</tr>

			<tr>
				<th>Cost</th>
				<td><form:input path="cost" type="number" step="0.01"
						required="true" /></td>
			</tr>

			<tr>
				<td colspan="2" style="text-align: center"><input type="submit"
					value="Submit" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>
