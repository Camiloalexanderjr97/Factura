/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import VO.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander
 */
public class ClienteDao {

    public ClienteDao() {
    }
    Cliente c = new Cliente();
    Conexion con = new Conexion();
    Connection cn= con.Conexion();
    
    
    
   
    
    public String crearCliente(String cedula,String nombre, String apellido, String edad){
       String msj="";
        try {
           PreparedStatement pps = con.Conexion().prepareStatement("INSERT INTO cliente(Cedula,Nombre,Apellido,Edad) VALUES (?,?,?,?)");
            pps.setString(1, cedula);
            pps.setString(2, nombre);
            pps.setString(3, apellido);
            pps.setString(4, edad);
            pps.executeUpdate();
            msj="Cliente Creado";
            System.out.println(msj);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        return msj;
    }
     public Cliente BuscarArticulo(String nombre){
        Cliente c = null;
        try {
            PreparedStatement pps = con.Conexion().prepareStatement("SELECT * FROM cliente WHERE Nombre=?");
            
            pps.setString(1, nombre);
            
            ResultSet rs = pps.executeQuery();
            if(rs.next()){
                c = new Cliente();
                c.setCedula(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setEdad(rs.getString(4));
                
                System.out.println("correcto");
                return c;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        return c;
    }
}
