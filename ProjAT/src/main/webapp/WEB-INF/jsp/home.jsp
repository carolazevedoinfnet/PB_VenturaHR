<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>AT - Engenharia Disciplinada de Softwares</title>
  <title>Prof: Armenio Cardoso</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
    <img class="card-img-top" src="img/vaga.png" alt="Vaga" style="width:100%">
    <div class="card-body">
      <a href="/vaga" class="btn btn-primary btn-sm">Cadastrar Vagas</a>
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

    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/criterio.png" alt="Criterio" style="width:100%">
    <div class="card-body">
      <a href="/criterio" class="btn btn-primary btn-sm">Cadastrar Criterios</a>
    </div>
 </div>

 
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/lista_criterios.png" alt="Criterios" style="width:100%">
    <div class="card-body">
      <a href="/criterios" class="btn btn-primary btn-sm">Lista Criterios</a>
    </div>
  </div>
  
  
    <div class="column">
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/resposta.png" alt="Resposta" style="width:100%">
    <div class="card-body">
      <a href="/resposta" class="btn btn-primary btn-sm">Enviar Resposta</a>
    </div>
  </div>
  </div>
  
 
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/lista_respostas.png" alt="Respostas" style="width:100%">
    <div class="card-body">
      <a href="/respostas" class="btn btn-primary btn-sm">Lista Respostas</a>
      
      
    </div>
  </div>
  
  </div>
     <br>
  </div>
    </div>
    
        
            

</body>
</html>