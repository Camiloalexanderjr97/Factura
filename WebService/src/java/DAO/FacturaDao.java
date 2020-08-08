/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import VO.Articulo;
import VO.Cliente;
import VO.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexander
 */
public class FacturaDao {

    Conexion con = new Conexion();
    Connection cn = con.Conexion();
    PreparedStatement pps = null;
    ResultSet rs = null;

    ArticuloDao a = new ArticuloDao();
    ClienteDao c = new ClienteDao();

    public FacturaDao() {
    }

    public String CrearFactura(String articulo, String cliente, int cantidad, int iva) {

        String msj = "";

        Articulo artNuevo = null;
        Factura f = new Factura();

        artNuevo = a.BuscarArticulo(articulo);
        f.setArticuloArticulo(artNuevo);
        f.setPrecio(artNuevo.getPrecio());
        f.setClienteCliente(c.BuscarCliente(cliente));

        Date data = new Date();
        java.sql.Date n = new java.sql.Date(data.getTime());
        double va = ((f.getPrecio() * iva) / 100) * cantidad;

        int aux = (int) va;
        f.setIva(iva);
        int total = aux + (f.getPrecio() * cantidad);
        f.setTotal(total);

        try {
            pps = con.Conexion().prepareStatement("INSERT INTO factura(Id_factura,Articulo_Articulo,Cantidad,Fecha,Cliente_Cliente,Precio,IVA,Total,Estado) VALUES (?,?,?,?,?,?,?,?,?)");
            pps.setInt(1, 0);
            pps.setObject(2, f.getArticuloArticulo().getIdArticulo());
            pps.setInt(3, cantidad);
            pps.setDate(4, n);
            pps.setObject(5, f.getClienteCliente().getCedula());
            pps.setInt(6, f.getPrecio());
            pps.setInt(7, f.getIva());
            pps.setInt(8, f.getTotal());
            pps.setString(9, "Activo");

            pps.executeUpdate();
            msj = "Factura Creada";

        } catch (Exception ex) {
            System.out.println("error" + ex);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }

        }
        return msj;
    }

    public List llenarLista() {
        List<Factura> lista = new ArrayList<>();
        try {
            pps = con.Conexion().prepareStatement("SELECT * FROM factura");
            rs = pps.executeQuery();
            while (rs.next()) {
                Factura a = new Factura();

                a.setIdfactura(rs.getInt(1));

                Articulo art = new Articulo();
                art.setIdArticulo(rs.getInt(2));

                a.setArticuloArticulo(art);
                a.setCantidad(rs.getInt(3));
                a.setFecha(rs.getDate(4));

                Cliente c = new Cliente();
                c.setCedula(rs.getString(5));

                a.setClienteCliente(c);
                a.setPrecio(rs.getInt(6));
                a.setIva(rs.getInt(7));
                a.setTotal(rs.getInt(8));
                a.setEstado(rs.getString(9));

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

    public Factura BuscarFactura(int id) throws SQLException {
        Factura c = null;
        try {
            pps = con.Conexion().prepareStatement("SELECT * FROM factura WHERE Id_factura=?");

            pps.setInt(1, id);

            rs = pps.executeQuery();
            if (rs.next()) {
                c = new Factura();
                Articulo a = new Articulo();
                c.setIdfactura(rs.getInt(1));

                a.setIdArticulo(rs.getInt(2));
                c.setArticuloArticulo(a);

                c.setCantidad(rs.getInt(3));
                c.setFecha(rs.getDate(4));

                Cliente clte = new Cliente();
                clte.setCedula(rs.getString(5));
                c.setClienteCliente(clte);

                c.setIva(rs.getInt(6));
                c.setTotal(rs.getInt(7));
                c.setEstado(rs.getString(8));

                return c;
            }

        } catch (Exception ex) {
            System.out.println("Error"+ex);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }
        }
        return c;
    }

    public String ModificarFactura(Factura f) {
        String msj = "";

        try {
            Date data = new Date();
            java.sql.Date n = new java.sql.Date(data.getTime());

            double va = ((f.getPrecio() * f.getIva()) / 100) * f.getCantidad();
            int iva = (int) va;
            int total = iva + (f.getPrecio() * f.getCantidad());

            String sql = "UPDATE factura SET Articulo_Articulo='" + f.getArticuloArticulo().getIdArticulo() + "',Cantidad='" + f.getCantidad() + "',Fecha='" + n + "',Cliente_Cliente='" + f.getClienteCliente().getCedula() + "',Precio='" + f.getPrecio() + "',IVA='" + f.getIva() + "',Total='" + total + "' WHERE Id_factura='" + f.getIdfactura() + "'";
            pps = con.Conexion().prepareStatement(sql);

            pps.executeUpdate();
            msj = "actualizada";

        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }
        }

        return msj;
    }

    public String EliminarFactura(String f) {
        String msj = "";

        try {
            String estado = "Desactivado";
            String sql = "UPDATE factura SET Estado='" + estado + "' WHERE Id_factura='" + f + "'";
            pps = con.Conexion().prepareStatement(sql);

            pps.executeUpdate();
            msj = "Factura Desactivada";

        } catch (Exception e) {
            System.out.println("error" + e);
        } finally {
            try {
                con.Desconectar();
            } catch (Exception e) {

            }
        }

        return msj;
    }
}
