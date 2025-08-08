<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Geometry INformation</title>
</head>
<body>

	<input type="button" value="Resister Geometry"
		onclick="window.location.href='/GeometryApp/showForm';return false"
		class="add-button" />
	<h1>THE GEOMETRY INFOMATION DISPLAYED BELOW</h1>

	<table border="1">
		<tr>
			<th>geometryId</th>
			<th>Brand</th>
			<th>shape</th>
			<th>cost</th>
			<th>color</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="variable" items="${Ginfo}">

			<c:url var="UpdateLink" value="/update-form">
				<c:param name="geoId" value="${variable.geometryId}"></c:param>
			</c:url>

			<c:url var="DeleteLink" value="/delete-data">
				<c:param name="geoId" value="${variable.geometryId}"></c:param>

			</c:url>

			<tr>
				<td>${variable.geometryId}</td>
				<td>${variable.brand}</td>
				<td>${variable.shape}</td>
				<td>${variable.cost}</td>
				<td>${variable.colour}</td>

				<td><a href="${UpdateLink}"> Update Information</a></td>
				<td><a href="${DeleteLink}"> Delete Information</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>