/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import VO.Articulo;
import VO.Cliente;
import java.sql.Connection;

/**
 *
 * @author Alexander
 */
public class FacturaDao {

    Conexion con = new Conexion();
    Connection cn = con.Conexion();
    public FacturaDao() {
    }
    
    public String CrearFactura(Articulo articulo,Cliente cliente){
        String msj="";
        
        
        return msj;
    }
   
    
    
}
