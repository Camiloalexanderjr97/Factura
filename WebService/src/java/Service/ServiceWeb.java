/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAO.ArticuloDao;
import DAO.ClienteDao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexander
 */
@WebService(serviceName = "ServiceWeb")
public class ServiceWeb {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarCliente")
    public String RegistrarCliente(@WebParam(name = "Cedula") String Cedula, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "Apellido") String Apellido, @WebParam(name = "Edad") String Edad) {
        //TODO write your implementation code here:
        
        ClienteDao c = new ClienteDao();
        String msj = c.crearCliente(Cedula, Nombre, Apellido, Edad);
        return msj;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarArticulo")
    public String RegistrarArticulo(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Cantidad") int Cantidad, @WebParam(name = "Precio") int Precio) {
        //TODO write your implementation code here:
        ArticuloDao a= new ArticuloDao();
        String msj = a.crearArticulo(Nombre, Cantidad, Precio);
        return msj;
    }
}
