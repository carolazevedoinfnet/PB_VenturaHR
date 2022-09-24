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




			<div class="form-group">
				<label for="hora">Dia da resposta:</label> <input type="date"
					name="dataResposta" required>
			</div>


			


			<div class="form-group">
				<label for="usr">Criterios:</label>
				<c:if test="${not empty criterios}">
					<div class="form-check">
						<label class="form-check-label">
							<c:forEach var="e" items="${criterios}">
								<input type="checkbox" class="form-check-input" name="criterioIds" value="${e.id}">${e.descricao}<br>
							</c:forEach>
						</label>
					</div>
				</c:if>
				<c:if test="${empty criterios}">
				<label for="usr">Nenhum critério cadastrado!</label>
				</c:if>
			</div>


			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
		<br>

		<c:import url="/WEB-INF/jsp/footer.jsp" />

	</div>

</body>
</html>
