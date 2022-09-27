<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>VenturaHR: Lista Respostas</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">

		<c:import url="/WEB-INF/jsp/header.jsp" />
		
					<table class="table table-striped">
		    <thead>
		   <tr>
		<th>ID</th>
		<th>Vaga</th>
		<th>Critério</th>
		<th>Excluir</th>
  
       
    
      </tr>
		    </thead>
		
    <tbody>

		<c:forEach var="r" items="${listaResposta}">

			 <tr>
			         <td>${r.id}</td>
			         <td>${r.getUsuario()}</td>
			         <td>${r.getVaga()}</td>
			          <td>${r.getCriterios()}</td>
			    
			         
			        <td><a href="/resposta/excluir/${r.id}">excluir</a></td>
			      </tr>
			
			
		</c:forEach>
 </tbody>

			  </table>
			<c:import url="/WEB-INF/jsp/footer.jsp"/>	
	</div>
</body>
</html>