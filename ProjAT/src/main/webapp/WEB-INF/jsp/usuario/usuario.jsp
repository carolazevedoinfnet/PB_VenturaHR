<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>VenturaHR:Cadastrar Usuário</title>
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


  <h2>Cadastro de Usuarios</h2>

  <form action="/usuario" method="post">
  
    <div class="form-group">
      <label for="nome">Nome/Razão:</label>
      <input type="text" class="form-control" name="nome">
    </div>
    
     <div class="form-group">
      <label for="nome">Endereço:</label>
      <input type="text" class="form-control" name="endereco">
    </div>
    
     <div class="form-group">
      <label for="nome">Telefone:</label>
      <input type="text" class="form-control" name="telefone">
    </div>
    
    
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" name="email">
    </div>
    
     <div class="form-group">
      <label for="email">CPF/Cnpj:</label>
      <input type="text" class="form-control" name="cpf">
    </div>
 
   
	
    <div class="form-group">
      <label for="plano">Tipo de Conta:</label>
		<select name="plano" class="form-control">
			<option value="--">----</option>
			<option value="Administrador">Administrador</option>
			<option value="Candidato">Candidato</option>
			<option value="Empresa">Empresa</option>
		
		</select>
    </div>
    
     <br>
  
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
  <br>
  
  	<c:import url="/WEB-INF/jsp/footer.jsp"/>	

</div>

</body>
</html>
    