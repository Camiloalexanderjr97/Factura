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
    </head>
    <body>
        <table border="1" cellpadding="2">
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
            %>
            <tbody>
                <tr>
                    <td><%=fact.getIdfactura()%>   </td>
                    <td><%=fact.getArticuloArticulo().getIdArticulo()%>   </td>
                    <td><%=fact.getClienteCliente().getCedula()%>  </td>
                    <td><%=fact.getCantidad()%>   </td>
                    <td><%=fact.getIva()%>   </td>
                    <td><%=fact.getTotal()%>   </td>
                    <td>
                        <a href="../ModificarF?accion=editar" >Editar</a>
                        <a href="EliminarFactura.jsp">Eliminar</a>
                    </td>
                </tr>
                <%}%>

            </tbody>
        </table>

    </body>
</html>
