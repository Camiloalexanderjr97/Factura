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
        <title>Crear Cliente</title>
        <link rel="stylesheet" href="../CSS/styloCrear_1.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

    </head>
    <body>
        <div class="wrapper">  
            <form action="../RegistrarCliente" method="POST" class="login">
                <p class="title">Registro de Clientes</p>
                <input name="cedula" type="text" placeholder="Cedula" autofocus/>
                <i class="fa fa-user"></i>
                <input name="nombre" type="text" placeholder="Nombre" />
                <i class="fa fa-user"></i>
                <input name="edad"   type="text" placeholder="Edad" />
                <i class="fa fa-key"></i>
                <Button class="spinner">Registrar</button>
                 
                 <div>
                     <a type="button" href="../index.html"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Atras</a>
                 </div>

            </form>
            <footer><a target="blank" href="http://boudra.me/">boudra.me</a></footer>
        </p>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="../JS/action.js"></script>
</body>
</html>
