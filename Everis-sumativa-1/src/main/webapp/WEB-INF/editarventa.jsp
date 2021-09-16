<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Editar Venta</title>
</head>

<body>
	<div>
		<!-- monto_total, numero de productos, observaciones, vendedor -->

		<h4 class="text-danger">
			<c:out value="${error}"></c:out>
		</h4>

		<form:form action="/venta/modificar" method="post"
			modelAttribute="venta">
			<form:hidden path="id" />

			<form:label path="monto_total">Monto total:</form:label>
			<form:input type="number" path="monto_total" />

			<form:label path="numero_de_productos">Número de Productos:</form:label>
			<form:input type="number" min="0" step="1" path="numero_de_productos" />

			<form:label path="observaciones">Observaciones:</form:label>
			<form:input type="text" path="observaciones" />

			<form:label path="vendedor">Vendedor:</form:label>
			<form:input type="text" path="vendedor" />

			<input type="submit" value="Confirmar Edición">
		</form:form>
		<br>
	</div>
</body>

</html>
