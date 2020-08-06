/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.ArticuloDao;
import DAO.ClienteDao;
import DAO.FacturaDao;
import VO.Articulo;
import VO.Cliente;
import VO.Factura;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexander
 */
@WebService(serviceName = "ServiceWeb")
public class ServiceWeb {

    ArticuloDao a = new ArticuloDao();

    ClienteDao c = new ClienteDao();

    FacturaDao f = new FacturaDao();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarArticulo")
    public String RegistrarArticulo(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Cantidad") int Cantidad, @WebParam(name = "Precio") int Precio) {
        //TODO write your implementation code here:

        String msj = a.crearArticulo(Nombre, Cantidad, Precio);
        return msj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Articulos")
    public List<Articulo> Articulos() {
        //TODO write your implementation code here:
        return a.llenarLista();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Clientes")
    public List<Cliente> Clientes(){
        //TODO write your implementation code here:
        return c.llenarLista();
    }

       @WebMethod(operationName = "FacturaList")
    public List<Factura> FacturaList() {
        //TODO write your implementation code here:
        return f.llenarLista();
    }

    /**
     * Web service operation
     */
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ClienteRegistro")
    public String ClienteRegistro(@WebParam(name = "Cedula") String Cedula, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Edad") String Edad) {
        //TODO write your implementation code here:
        return c.crearCliente(Cedula, Nombre, Edad);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CrearFactura")
    public String CrearFactura(@WebParam(name = "Articulo") String Articulo, @WebParam(name = "Cliente") String Cliente, @WebParam(name = "Cantidad") int Cantidad,@WebParam(name = "Iva") int Iva){

        String msj = f.CrearFactura(Articulo, Cliente, Cantidad,Iva);
        return msj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarFactura")
    public String ModificarFactura(@WebParam(name = "Factura") Factura Factura) {
        
        //TODO write your implementation code here:
        return f.ModificarFactura(Factura);
    }

    /**
     * Web service operation
     */
 
}
