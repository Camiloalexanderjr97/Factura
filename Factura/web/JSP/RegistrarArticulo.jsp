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
        <link rel="stylesheet" href="../CSS/styloCrear_1.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

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

                <div>
                    <a type="button" href="../index.html"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Atras</a>
                </div>

            </form>

        </div>
        <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
        <script src="../JS/action.js"></script>
    </body>
</html>
