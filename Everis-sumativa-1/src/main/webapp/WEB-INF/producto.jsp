<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Producto</title>
</head>

<body>
	<div>

		<form:form action="/producto/crear" method="post"
			modelAttribute="producto">

			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre" />

			<form:label path="codigo">Codigo:</form:label>
			<form:input type="text" path="codigo" />

			<form:label path="categoria">Categoria:</form:label>
			<form:input type="text" path="categoria" />

			<form:label path="precio">Precio:</form:label>
			<form:input type="text" path="precio" />

			<input type="submit" value="Crear Producto">

		</form:form>

		<br>


		<h1>Lista productos</h1>

		<table>
			<thead>
				<tr>
					<th>#</th>
					<th>Nombre</th>
					<th>Codigo</th>
					<th>Categoria</th>
					<th>Precio</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="producto" items="${lista_productos}">
					<tr>

						<td><c:out value="${producto.id}" /></td>
						<td><c:out value="${producto.nombre}" /></td>
						<td><c:out value="${producto.codigo}" /></td>
						<td><c:out value="${producto.categoria}" /></td>
						<td><c:out value="${producto.precio}" /></td>

						<td><a href="/producto/actualizar/${producto.id}">Editar</a>
							<form action="/producto/eliminar/${producto.id}" method='POST'>
								<input type="hidden" name="id"
									value="<c:out value="${producto.id}" />"> <input
									type="submit" value="Eliminar">
							</form></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>


	</div>
</body>

</html>