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
public class ClienteList {

    public java.util.List<service.Cliente> clientes() {
        service.ServiceWeb_Service service = new service.ServiceWeb_Service();
        service.ServiceWeb port = service.getServiceWebPort();
        return port.clientes();
    }
 

}
