<%-- 
    Document   : Crear
    Created on : 29/07/2020, 06:10:21 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Articulo</title>
        <link rel="stylesheet" href="../CSS/styloCrear.css">
    </head>
    <body>
     <div class="wrapper">  
         <form action="../RegistrarArticulo" method="POST" class="login">
    <p class="title">Registro de Articulos</p>
    <input name="nombre" type="text" placeholder="Nombre" autofocus/>
    <i class="fa fa-user"></i>
    <input name="cantidad" type="number" placeholder="Cantidad" />
    <input name="precio" type="number" placeholder="Precio" autofocus/>
    
    <Button class="spinner">Registrar</button>

      
  </form>
  <footer><a target="blank" href="http://boudra.me/">boudra.me</a></footer>
  </p>
</div>
          <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
          <script src="../JS/action.js"></script>
    </body>
</html>
