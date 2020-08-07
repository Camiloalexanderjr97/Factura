<%-- 
    Document   : Listar
    Created on : 2/08/2020, 10:47:00 PM
    Author     : Alexander
--%>

<%@page import="java.util.List"%>
<%@page import="service.Factura"%>
<%@page import="Modelo.FacturaList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    </head>
    <body>
    <center> <h1 style="padding-top: 30px">Facturas</h1></center>
    <center><form  style="width: 1000px">
            <table class="table table-bordered" style="padding: 30px" border="1" cellpadding="2">
                <thead>
                    <tr>
                        <th>N° Factura</th>
                        <th>Articulo</th>
                        <th>Cliente</th>
                        <th>Cantidad</th>
                        <th>Iva</th>
                        <th>Total</th>
                    </tr>
                </thead>

                <%
                    FacturaList f = new FacturaList();
                    List<Factura> lista = f.facturaList();
                    for (Factura fact : lista) {
                        if (fact.getEstado().equalsIgnoreCase("Activo")) {
                %>
                <tbody>
                    <tr>
                        <td><%=fact.getIdfactura()%>   </td>
                        <td><%=fact.getArticuloArticulo().getIdArticulo()%>   </td>
                        <td><%=fact.getClienteCliente().getCedula()%>  </td>
                        <td><%=fact.getCantidad()%>   </td>
                        <td><%=fact.getIva()%>   </td>
                        <td><%=fact.getTotal()%>   </td>

                    </tr>
                    <%}
                        }%>

                </tbody>
            </table>
            <a type="button" href="ModificarFactura.jsp"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Modificar Factura</a>

            <a type="button" href="../index.html"  style="width: 280px; height: 50px; color: #ffffff; font-size: 20px"  class="btn btn-primary">Regresar</a>

        </form></center>

</body>
</html>
