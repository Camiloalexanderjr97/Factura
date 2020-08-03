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
        <link rel="stylesheet" href="../CSS/styloCrear_1.css">
    </head>
    <body>


        <div class="wrapper">
            <form class="login" action="../Factura" method="post">

                <p class="title">Registro de Factura</p>
                <label>Articulo</label>
                <select name="articulo">
                    <%
                        ArticuloList a = new ArticuloList();
                        List<Articulo> lista = a.articulos();
                        for (Articulo arts : lista) {
                    %>
                    <option style="width: 100px"><%=arts.getNombre()%>   </option>>
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

                <Button class="spinner">Registrar</button>


            </form>
        </div>
    </p>
</div>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="../JS/action.js"></script>
</body>
</html>
