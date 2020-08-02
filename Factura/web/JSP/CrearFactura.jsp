<%-- 
    Document   : Crear
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
        <title>Crear Factura</title>
        <link rel="stylesheet" href="../CSS/styloCrear.css">
    </head>
    <body>


        
        <p class="title">Registro de Factura</p>
        <div>
            <select style="width: 100px"name="nombre">
                <%
                   ArticuloList a = new ArticuloList();
                   List<Articulo> lista = a.articulos();
                   for(Articulo arts: lista){
    %>
                <option style="width: 100px"><%=arts.getNombre()%>   </option>>
                <%}%>
            </select>
            <select style="width: 100px"name="nombre">
                <%
                   ClienteList c = new ClienteList();
                   List<Cliente> listaC = c.clientes();
                   for(Cliente cliente: listaC){
    %>
                <option style="width: 100px"><%=cliente.getNombre()%>   </option>>
                <%}%>
            </select>
        
        </div>
        <i class="fa fa-user"></i>
        <input name="cantidad" type="number" placeholder="Cantidad" />
        <input name="precio" type="number" placeholder="Precio" autofocus/>

        <Button class="spinner">Registrar</button>


        <a href="../index.html">asda</a>
        <footer><a target="blank" href="http://boudra.me/">boudra.me</a></footer>
    </p>

    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="../JS/action.js"></script>
</body>
</html>
