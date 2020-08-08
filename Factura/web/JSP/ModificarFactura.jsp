<%-- 
    Document   : Modificar
    Created on : 29/07/2020, 06:10:21 PM
    Author     : Alexander
--%>

<%@page import="service.Cliente"%>
<%@page import="Modelo.ClienteList"%>
<%@page import="service.Articulo"%>
<%@page import="service.Articulos"%>
<%@page import="Modelo.ArticuloList"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Factura</title>
        <link rel="stylesheet" href="../CSS/styloCrear_1.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

    </head>
    <body>


        <div class="wrapper">
            <form class="login" action="../ActualizarF" method="POST" >

                <p class="title">Editar Factura</p>
                
                <i class="fa fa-user"></i>
                <input name="id" type="number" placeholder="ID" />

                <label>Articulo</label>
                <select  name="articulo">
                    <%
                        ArticuloList a = new ArticuloList();
                        List<Articulo> lista = a.articulos();
                        for (Articulo arts : lista) {
                    %>
                    <option ><%=arts.getNombre()%>   </option>>
                    <%}%>
                </select>

                <i class="fa fa-user"></i>
                <label>Cliente</label>

                <select name="cliente" >
                    <%
                        ClienteList c = new ClienteList();
                        List<Cliente> listaC = c.clientes();
                        for (Cliente cliente : listaC) {
                    %>
                    <option style="width: 100px"><%=cliente.getNombre()%></option>>
                    <%}%>
                </select>

                <i class="fa fa-user"></i>
                
                <input name="cantidad" type="number" placeholder="Cantidad" />
                <input name="precio" type="number" placeholder="Precio" />
                
                <i class="fa fa-user"></i>
                <input name="iva" type="number" placeholder="Iva" />
               
                
                 <Button class="spinner">Modificar</button>
                 
                 <div>
                     <a type="button" href="../index.html"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Atras</a>
                 </div>

            </form>
        </div>
                            
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="../JS/action.js"></script>
</body>
</html>
