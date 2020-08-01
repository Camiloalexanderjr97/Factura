/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import VO.Articulo;
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
public class ArticuloDao {

    Conexion con = new Conexion();
    Connection cn = con.Conexion();

    public ArticuloDao() {
    }

    public String crearArticulo(String nombre, int cantidad, int precio) {
        String msj = "";
        try {
            PreparedStatement pps = con.Conexion().prepareStatement("INSERT INTO articulo(Id_Articulo,Nombre,Cantidad,Precio) VALUES (?,?,?,?)");

            pps.setInt(1, 0);
            pps.setString(2, nombre);
            pps.setInt(3, cantidad);
            pps.setInt(4, precio);
            pps.executeUpdate();
            msj = "Articulo Creado";
            System.out.println(msj);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return msj;
    }
    
    public Articulo BuscarArticulo(String nombre){
        Articulo a = null;
        try {
            PreparedStatement pps = con.Conexion().prepareStatement("SELECT * FROM articulo WHERE Nombre=?");
            
            pps.setString(1, nombre);
            
            ResultSet rs = pps.executeQuery();
            if(rs.next()){
                a = new Articulo();
                a.setIdArticulo(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setCantidad(rs.getInt(3));
                a.setPrecio(rs.getInt(4));
                
                System.out.println("correcto");
                return a;
            }
            
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        return a;
    }

}
