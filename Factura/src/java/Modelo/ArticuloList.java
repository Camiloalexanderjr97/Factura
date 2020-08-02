/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alexander
 */
public class ArticuloList {
 
    public  java.util.List<service.Articulo> articulos() {
        service.ServiceWeb_Service service = new service.ServiceWeb_Service();
        service.ServiceWeb port = service.getServiceWebPort();
        return port.articulos();
    }

}
