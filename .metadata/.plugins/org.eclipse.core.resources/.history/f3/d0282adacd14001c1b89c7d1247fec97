<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="{% static 'style.css' %}">

<title>Registro de Usuarios</title>
</head>

<body>


	<div class="col-md-5 bg-light m-4 p-3 rounded text-secondary">

		<h3>Registro de Usuarios</h3>




		<form action='register' id='formRegister' method='post'>



			<table class="table table-striped table-bordered">


				<h4 class="text-danger">
					<c:out value="${nombreError}"></c:out>
				</h4>

				<tr>
					<th scope="row"><div>
							<label>Nombre : </label>
						</div></th>
					<td><input placeholder="Nombre" name="nombre" required=""></td>

				</tr>
				<tr>
					<th scope="row"><label>Apellido : </label></th>
					<td><input placeholder="Apellido" name="apellido" required=""></td>

				</tr>


				<h4 class="text-danger">
					<c:out value="${limiteError}"></c:out>
				</h4>

				<tr>
					<th scope="row"><label>Límite : </label></th>
					<td><input placeholder="limite" name="limite" required=""
						type="number"></td>
				</tr>


				<h4 class="text-danger">
					<c:out value="${codigoError}"></c:out>
				</h4>


				<tr>
					<th scope="row"><label>Código Postal</label></th>
					<td><input placeholder="Codigo postal" name="codigo"
						required="" type="number"></td>

				</tr>
				<tr>
					<td scope="row"></td>
					<td>
					<button type='submit'
							class="btn btn-warning col ">Limpiar</button>
						<button type='submit' class="btn btn-success col">Submit</button>
					</td>

				</tr>
				</tbody>
			</table>





		</form>

	</div>


</body>

</html>