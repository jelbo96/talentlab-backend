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

		<form:form action="/empleado/modificar" method="post"
			modelAttribute="empleado">
			

			<form:hidden path="id" />

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


			<input type="submit" value="Confirmar Edición">

		</form:form>

		<br>


	</div>
</body>

</html>