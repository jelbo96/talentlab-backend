<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <link rel="stylesheet" type="text/css" href="{% static 'style.css' %}">

    <title>Registro de Usuarios</title>
</head>

<body>


    <div class="col-md-5 bg-light m-4 p-3 rounded text-secondary">

        <h3>Registro de Usuarios</h3>
        <h4 class="text-danger"><c:out value="${limiteError}"></c:out></h4>
        <h4 class="text-danger"><c:out value="${nombreError}"></c:out></h4>
        <h4 class="text-danger"><c:out value="${codigoError}"></c:out></h4>

        <form action='register' id='formRegister' method='post'>
            <div>
                <label>Nombre</label>
                <input placeholder="Nombre" name="nombre" required="">
            </div>

            <div>
                <label>Apellido</label>
                <input placeholder="Apellido" name="apellido" required="">
            </div>

            <div>
                <label>Límite</label>
                <input placeholder="limite" name="limite" required="" type="number">
            </div>

            <div>
                <label>Código Postal</label>
                <input placeholder="ingrese codigo postal" name="codigo" required="" type="number">
            </div>




            <button type='submit' class="btn btn-primary col-sm-3 m-2">Limpiar</button>
            <button type='submit' class="btn btn-primary col-sm-3 m-2">Submit</button>
        </form>

    </div>


</body>

</html>