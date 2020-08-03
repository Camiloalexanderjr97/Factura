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

    public FacturaDao() {
    }

    public String CrearFactura(String articulo, String cliente, int cantidad) {
        String msj = "";
        Factura f = new Factura();
        ArticuloDao a = new ArticuloDao();
        ClienteDao c = new ClienteDao();

        f.setArticuloArticulo(a.BuscarArticulo(articulo));
        f.setClienteCliente(c.BuscarCliente(cliente));
        Date data = new Date();
        java.sql.Date n = new java.sql.Date(data.getTime());

        double va = ((f.getArticuloArticulo().getPrecio() * 3) / 100) * cantidad;
        int iva = (int) va;

        int total = iva + (f.getArticuloArticulo().getPrecio() * cantidad);
        System.out.println(total);
        f.setTotal(total);
        f.setIva(iva);

        try {
            PreparedStatement pps = con.Conexion().prepareStatement("INSERT INTO factura(Id_factura,Articulo_Articulo,Fecha,Cliente_Cliente,IVA,Total,Estado) VALUES (?,?,?,?,?,?,?)");
            pps.setInt(1, 0);
            pps.setObject(2, f.getArticuloArticulo().getIdArticulo());
            pps.setDate(3, n);
            pps.setObject(4, f.getClienteCliente().getCedula());
            pps.setInt(5, f.getIva());
            pps.setInt(6, f.getTotal());
            pps.setString(7, "activo");

            pps.executeUpdate();
            msj = "Cliente Creado";
            System.out.println(msj);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return msj;
    }

    public List<Factura> llenarLista() {
        List<Factura> lista = new ArrayList<>();
        try {
            PreparedStatement pps = con.Conexion().prepareStatement("SELECT * FROM factura");
            ResultSet rs = pps.executeQuery();
            while (rs.next()) {
                Factura a = new Factura();
                a.setIdfactura(rs.getInt(1));
                int aux=rs.getInt(2);
                a.setArticuloArticulo((Articulo.class.cast(aux)));
                a.setFecha(rs.getDate(3));
                a.setClienteCliente((Cliente) rs.getObject(4));

                a.setIva(rs.getInt(5));
                a.setTotal(rs.getInt(6));
                a.setEstado(rs.getString(7));

                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        System.out.println(lista);
        return lista;
    }

}
