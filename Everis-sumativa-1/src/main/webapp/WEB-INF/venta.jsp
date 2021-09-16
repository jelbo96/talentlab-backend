<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Venta</title>
</head>

<body>

	<a href="/usuario">Usuarios</a>
	<a href="/venta">Ventas</a>
	<a href="/producto">Productos</a>

	<div>

		<h4 class="text-danger">
			<c:out value="${error}"></c:out>
		</h4>

		<form:form action="/venta/crear" method="post" modelAttribute="venta">

			<!-- monto_total, numero de productos, observaciones, vendedor -->

			<form:label path="monto_total">Monto Total:</form:label>
			<form:input type="number" path="monto_total" />

			<form:label path="numero_de_productos">Número de Productos:</form:label>
			<form:input type="number" min="0" step="1" path="numero_de_productos" />

			<form:label path="observaciones">Observaciones:</form:label>
			<form:input type="text" path="observaciones" />

			<form:label path="vendedor">Vendedor:</form:label>
			<form:input type="text" path="vendedor" />

			<input type="submit" value="Crear Venta">

		</form:form>

		<br>


		<h1>Lista ventas</h1>

		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Monto total</th>
					<th>Número de Productos</th>
					<th>Observaciones</th>
					<th>Vendedor</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="venta" items="${lista_ventas}">
					<tr>

						<td><c:out value="${venta.id}" /></td>
						<td><c:out value="${venta.monto_total}" /></td>
						<td><c:out value="${venta.numero_de_productos}" /></td>
						<td><c:out value="${venta.observaciones}" /></td>
						<td><c:out value="${venta.vendedor}" /></td>

						<td><a href="/venta/actualizar/${venta.id}">Editar</a>
							<form action="/venta/eliminar/${venta.id}" method='POST'>
								<input type="hidden" name="id"
									value="<c:out value="${venta.id}" />"> <input
									type="submit" value="Eliminar">
							</form></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


	</div>
</body>

</html>