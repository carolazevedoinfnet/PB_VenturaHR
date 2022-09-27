<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html lang="en">
<head>
<title>VenturaHR: Cadastrar Resposta</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<c:import url="/WEB-INF/jsp/header.jsp" />


		<h2>Incluir Resposta</h2>

		<form action="/resposta/incluir" method="post">


        <c:if test="${not empty vagas}">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Id</th>
                    <th>Cargo</th>
                    <th>Cidade</th>
                    <th>Tipo de Contratatação</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vaga" items="${vagas}" varStatus="id">
                    <tr>
                        <td>${vaga.id}</td>
                        <td>${vaga.cargo}</td>
                        <td>${vaga.cidade}</td>
                        <td>${vaga.contratacao}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>

        <c:if test="${empty vagas}">
            <h4>Não há nenhuma vaga publicada no sistema!</h4>
        </c:if>
    </div>

</div>


			<button type="submit" class="btn btn-primary">Responder</button>
		</form>
		<br>


	</div>

</body>
</html>
