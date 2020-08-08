/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Modelo.ArticuloList;
import Modelo.ClienteList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import service.Factura;
import service.Cliente;
import service.Articulo;
import service.ServiceWeb_Service;

/**
 *
 * @author Alexander
 */
public class ActualizarF extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebService/ServiceWeb.wsdl")
    private ServiceWeb_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ArticuloList a = new ArticuloList();
    Articulo art = new Articulo();
    Cliente c = new Cliente();
    ClienteList clte = new ClienteList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");

            String cedula = request.getParameter("cliente");

            String articulo = request.getParameter("articulo") + "";

            String cantidad = request.getParameter("cantidad");

            String iva = request.getParameter("iva");
            String precio = request.getParameter("precio");

            int cant = Integer.parseInt(cantidad);
            int i = Integer.parseInt(id);
            int ivaN = Integer.parseInt(iva);
            int precioN = Integer.parseInt(precio);

            Factura f = new Factura();

            f.setIdfactura(i);

            c.setCedula(clte.buscar(cedula).getCedula());
            f.setClienteCliente(c);

            art.setIdArticulo(a.buscar(articulo).getIdArticulo());
            f.setArticuloArticulo(art);

            f.setCantidad(cant);
            f.setPrecio(precioN);
            f.setIva(ivaN);
            modificarFactura(f);
           response.sendRedirect("JSP/Listar.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String modificarFactura(service.Factura factura) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.ServiceWeb port = service.getServiceWebPort();
        return port.modificarFactura(factura);
    }

}
