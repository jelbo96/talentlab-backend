<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Editar Producto</title>
</head>

<body>
	<div>
		<form:form action="/producto/modificar" method="post"
			modelAttribute="producto">	
			<form:hidden path="id" />

			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" />

			<form:label path="codigo">Codigo:</form:label>
			<form:input type="text" path="codigo" />

			<form:label path="categoria">Categoria:</form:label>
			<form:input type="text" path="categoria" />

			<form:label path="precio">Precio:</form:label>
			<form:input type="text" path="precio" />

			<input type="submit" value="Confirmar Edición">
		</form:form>
		<br>
	</div>
</body>

</html>