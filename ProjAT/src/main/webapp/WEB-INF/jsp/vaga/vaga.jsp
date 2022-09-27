<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>VenturaHR: Cadastrar Vaga </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

	<c:import url="/WEB-INF/jsp/header.jsp" />


  <h2>Cadastro de Vagas</h2>

  <form action="/vaga" method="post">
                <div class="form-group">
                    <input type="hidden" class="form-control" name="usuarioId" value=${usuario.id}>
                </div>
                <div class="form-group">
                    <label>Cargo:</label>
                    <input type="text" class="form-control" name="cargo" value=${vaga.cargo}>
                </div>
                 <div class="form-group">
                    <label>Descrição:</label>
                    <input type="text" class="form-control" name="descricao" value=${vaga.descricao}>
                </div>
                <div class="form-group">
                    <label>Empresa:</label>
                    <input type="text" class="form-control" name="empresa" value=${vaga.empresa}>
                </div>
                <div class="form-group">
                    <label>Cidade:</label>
                    <input type="text" class="form-control" name="cidade" value=${vaga.cidade}>
                </div>
                
                <div class="form-group">
                    <label>Estado:</label>
                    <input type="text" class="form-control" name="estado" value=${vaga.estado}>
                </div>
                <div class="form-group">
                    <label>Tipo de Contratatação:</label>
                    <input type="text" class="form-control" name="contratacao" value=${vaga.contratacao}>
                </div>
                
                     
               <button type="submit" class="btn btn-primary">Continuar</button>
                
            </form>

            <c:if test="${not empty vaga}">
                <h4 class="text-center fs-5">Informar os critérios da vaga</h4>
                <form action="/criterio" method="post">
                    <div class="form-group">
                        <label>Nome:</label>
                        <input type="text" class="form-control" name="nome" value=${criterio.nome}>
                    </div>
                    <div class="form-group">
                        <label>Perfil:</label>
                        <input type="number" min="1" max="5" class="form-control" name="perfil" value=${criterio.perfil}>
                    </div>
                    <div class="form-group">
                        <label>Peso:</label>
                        <input type="number" min="1" max="5" class="form-control" name="peso" value=${criterio.peso}>
                    </div>
                    
                   <button type="submit" class="btn btn-default">Adicionar Critério</button>
                </form>
                
                <hr>
                <form action="listaVagas" method="post">
                    <button type="submit" class="btn btn-default">Cadastrar Vaga</button>
                </form>
                
            </c:if>
            
             <br>
  
 	<c:import url="/WEB-INF/jsp/footer.jsp"/>	
 	
        </div>		

  
 
		

</body>
</html>
