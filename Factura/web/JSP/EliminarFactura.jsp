<%-- 
    Document   : EliminarFactura
    Created on : 2/08/2020, 10:36:58 PM
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../CSS/styloCrear_1.css">
             <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
   
    </head>
    <body>
        
         <div class="wrapper">
            <form class="login" action="../EliminarF" method="POST" >

                <p class="title">Eliminar Factura</p>
                
                <i class="fa fa-user"></i>
                <label>#Factura</label>
                <input name="id" type="number" placeholder="ID" />
                
                                
                <Button class="spinner">Eliminar</button>
                
                
                <p>Se debe recalcar el hecho de que fisicamente no se debe eliminar una factura</p>
                <p>por ende se realiza un "Eliminado logico" el cual procede a la desactivacion de la factura</p>
            
                
                
                  <div>
                    <a type="button" href="../index.html"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Atras</a>
                </div>
            </form>
    </body>
</html>
