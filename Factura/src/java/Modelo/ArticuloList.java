/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import service.Articulo;

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
    
    public Articulo buscar(String nombre){
        Articulo n = null;
        
                        List<Articulo> lista = articulos();
                        for (Articulo arts : lista) {
                            if(arts.getNombre().equalsIgnoreCase(nombre)){
                                n=arts;
                            }
                        }
        return n;
    }
    

}
