<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Usuario</title>
</head>

<body>

	<a href="/usuario">Usuarios</a>
	<a href="/venta">Ventas</a>
	<a href="/producto">Productos</a>
	<div>

		<h4 class="text-danger">
			<c:out value="${error}"></c:out>
		</h4>

		<form:form action="/usuario/crear" method="post"
			modelAttribute="usuario">

			<form:label path="rut">Rut:</form:label>
			<form:input type="text" path="rut" />

			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" />

			<form:label path="apellido">Apellido:</form:label>
			<form:input type="text" path="apellido" />

			<form:label path="edad">Edad:</form:label>
			<form:input type="number" min="0" step="1" path="edad" />

			<input type="submit" value="Crear Usuario">

		</form:form>

		<br>


		<h1>Lista usuarios</h1>

		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Edad</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="usuario" items="${lista_usuarios}">
					<tr>

						<td><c:out value="${usuario.id}" /></td>
						<td><c:out value="${usuario.rut}" /></td>
						<td><c:out value="${usuario.nombre}" /></td>
						<td><c:out value="${usuario.apellido}" /></td>
						<td><c:out value="${usuario.edad}" /></td>

						<td><a href="/usuario/actualizar/${usuario.id}">Editar</a>
							<form action="/usuario/eliminar/${usuario.id}" method='POST'>
								<input type="hidden" name="id"
									value="<c:out value="${usuario.id}" />"> <input
									type="submit" value="Eliminar">
							</form></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


	</div>
</body>

</html>