<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>empleado</title>
</head>

<body>
	<div>

		<form:form action="/empleado/crear" method="post"
			modelAttribute="empleado">


			<form:label path="rut">Rut:</form:label>
			<form:input type="text" path="rut" />

			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" />

			<form:label path="apellido">Apellido:</form:label>
			<form:input type="text" path="apellido" />

			<form:label path="edad">Edad:</form:label>
			<form:input type="text" path="edad" />

			<form:label path="profesion">Profesion:</form:label>
			<form:input type="text" path="profesion" />

			<form:label path="cargo">Cargo:</form:label>
			<form:input type="text" path="cargo" />


			<input type="submit" value="Crear Empleado">

		</form:form>

		<br>


		<h1>Lista empleados</h1>

		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Rut</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Edad</th>
					<th>Profesion</th>
					<th>Cargo</th>
					<th>Acciones</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="empleado" items="${lista_empleados}">
					<tr>

						<td> <c:out value="${empleado.id}" /> </td>
						<td> <c:out value="${empleado.rut}" /> </td>
						<td> <c:out value="${empleado.nombre}" /> </td>
						<td> <c:out value="${empleado.apellido}" /> </td>
						<td> <c:out value="${empleado.edad}" /> </td>
						<td> <c:out value="${empleado.profesion}" /> </td>
						<td> <c:out value="${empleado.cargo}" /> </td>
						<td> 
						<a href="/empleado/actualizar/${empleado.id}">Editar</a>
							<form action="/empleado/eliminar/${empleado.id}" method='POST'>
								<input type="hidden" name="id" value="<c:out value="${empleado.id}" />">
								<input type="submit" value="Eliminar">
							</form>
						</td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


	</div>
</body>

</html>