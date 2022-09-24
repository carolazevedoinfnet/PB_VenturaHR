<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>VenturaHR: Administrador </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<div class="container-fluid" style="margin-top:20px">
<c:import url="/WEB-INF/jsp/header.jsp"/>
</div>


  <div class="row">
  <div class="card" style="width:170px">
    <img class="card-img-top" src="img/usuario.png" alt="Usuario" style="width:100%">
    <div class="card-body">
      <a href="/usuario" class="btn btn-primary btn-sm">Cadastrar Usuarios</a>
    </div>
  </div>
  <br>
  

    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/lista_usuarios.png" alt="Usuarios" style="width:100%">
    <div class="card-body">
      <a href="/usuarios" class="btn btn-primary btn-sm">Lista Usuarios</a>
    </div>
  </div>
  <br>
  
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/lista_vagas.png" alt="Vagas" style="width:100%">
    <div class="card-body">
      <a href="/vagas" class="btn btn-primary btn-sm">Lista Vagas</a>
  </div>
  </div>
    <br>
 
   <div class="row">

 

      
      
    </div>
  </div>
  
  </div>
     <br>

    
          <br>
  
  	<c:import url="/WEB-INF/jsp/footer.jsp"/>

</body>
</html>
