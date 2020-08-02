/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.ArticuloDao;
import DAO.ClienteDao;
import VO.Articulo;
import VO.Cliente;
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarCliente")
    public String RegistrarCliente(@WebParam(name = "Cedula") String Cedula, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "Edad") String Edad) {
        //TODO write your implementation code here:

        String msj = c.crearCliente(Cedula, Nombre, Apellido, Edad);
        return msj;
    }

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
    @WebMethod(operationName = "CrearFactura")
    public String CrearFactura(@WebParam(name = "Cliente") Object Cliente, @WebParam(name = "Articulo") Object Articulo) {
        //TODO write your implementation code here:
        return null;
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
    public List<Cliente> Clientes() {
        //TODO write your implementation code here:
        return c.llenarLista();
    }

    /**
     * Web service operation
     */
}
