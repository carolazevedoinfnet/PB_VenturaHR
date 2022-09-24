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
      <label for="usr">Cargo:</label>
      <input type="text" class="form-control" name="cargo">
    </div>

    <div class="form-group">
      <label for="usr">Descrição:</label>
      <input type="text" class="form-control" name="descricao">
    </div>
    
     <div class="form-group">
      <label for="usr">Empresa:</label>
      <input type="text" class="form-control" name="empresa">
    </div>
    
     <div class="form-group">
      <label for="usr">Cidade:</label>
      <input type="text" class="form-control" name="cidade">
    </div>
    
     <div class="form-group">
      <label for="usr">Estado:</label>
      <input type="text" class="form-control" name="estado">
    </div>
    
     
 
    	<div class="form-group">
	  <label for="usr">Tipo de Contratação:</label>
		<div class="form-check">
		  <label class="form-check-label">
			<input type="radio" class="form-check-input" name="contratacao" value="true"> CLT
		  </label>
		</div>
		<div class="form-check">
		  <label class="form-check-label">
			<input type="radio" class="form-check-input" name="contratacao" value="false" > Freelancer
		  </label>
		</div>
	</div>
	
	
			<div class="form-group">
				<label for="hora">Data da vaga:</label> <input type="date"
					name="dataVaga" required>
			</div>
	


    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
  
  <br>
 	<c:import url="/WEB-INF/jsp/footer.jsp"/>	
		
</div>

</body>
</html>
