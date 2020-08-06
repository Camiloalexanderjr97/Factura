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
import java.util.ArrayList;
import java.util.List;
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
    Connection cn = con.Conexion();
    PreparedStatement pps = null;
    ResultSet rs = null;

    public String crearCliente(String cedula, String nombre, String edad) {
        String msj = "";
        try {
            pps = con.Conexion().prepareStatement("INSERT INTO cliente(Cedula,Nombre,Edad) VALUES (?,?,?)");
            pps.setString(1, cedula);
            pps.setString(2, nombre);
            pps.setString(3, edad);
            pps.executeUpdate();
            msj = "Cliente Creado";
            System.out.println(msj);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }
        }

        return msj;
    }

    public Cliente BuscarCliente(String nombre) {
        Cliente c = null;
        try {
            pps = con.Conexion().prepareStatement("SELECT * FROM cliente WHERE Nombre=?");

            pps.setString(1, nombre);

            rs = pps.executeQuery();
            if (rs.next()) {
                c = new Cliente();
                c.setCedula(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setEdad(rs.getString(3));

                System.out.println("correcto");
                return c;
            }

        } catch (SQLException ex) {
            System.out.println("Error");
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }
        }
        return c;
    }

    public List<Cliente> llenarLista() {
        List<Cliente> lista = new ArrayList<>();
        try {
            pps = con.Conexion().prepareStatement("SELECT * FROM cliente");
            rs = pps.executeQuery();
            while (rs.next()) {
                Cliente a = new Cliente();
                a.setCedula(rs.getString(1));
                a.setNombre(rs.getString(2));
                a.setEdad(rs.getString(3));

                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }

        }
        return lista;
    }
}
