<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%-- Libreria core de JSTL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- Libreria form de Spring MVC --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Home</title>
	<style>
body {
	font-family: monospace;
	background-color: whitesmoke;
}

th {
	width: 15em;
	background-color: grey;
}

.celda {
	text-align: center;
	background-color: lightgrey;
}

td {
	width: 3em;
}
</style>
</head>
<body>
<h1>
	Mascotas 
</h1>
<P></P>

<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Estado</th>
					<th>Visitas</th>
					<th>Fecha Nacimiento</th>
					<th>Propietario</th>
					<th>Ver datos especificos</th>	
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lista}" var="lista">
					<tr class="celda">
						<td><c:out value="${lista.id}" /></td>
						<td><c:out value="${lista.nombre}" /></td>
						<td><c:out value="${lista.estado}" /></td>
						<td><c:out value="${lista.visitas}" /></td>
						<td><c:out value="${lista.fechaNac}" /></td>
						<td><c:out value="${lista.propietario}" /></td>
						
						<td><c:url value="/getPet" var="idPet">
								<c:param name="idPet" value="${lista.id}" />
							</c:url> <a href='<c:out value="${idPet}"/>'>Ver datos mascota</a></td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>
