/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.Date;


/**
 *
 * @author Alexander
 */
public class Factura {

    private static final long serialVersionUID = 1L;
    private Integer idfactura;
    private Date fecha;
    private int iva;
    private int total;
    private String estado;
    private Cliente clienteCliente;
    private Articulo articuloArticulo;

    public Factura() {
    }

    public Factura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Factura(Integer idfactura, Date fecha, int iva, int total, String estado) {
        this.idfactura = idfactura;
        this.fecha = fecha;
        this.iva = iva;
        this.total = total;
        this.estado=estado;
    }

    public Integer getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Integer idfactura) {
        this.idfactura = idfactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getClienteCliente() {
        return clienteCliente;
    }

    public void setClienteCliente(Cliente clienteCliente) {
        this.clienteCliente = clienteCliente;
    }

    public Articulo getArticuloArticulo() {
        return articuloArticulo;
    }

    public void setArticuloArticulo(Articulo articuloArticulo) {
        this.articuloArticulo = articuloArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfactura != null ? idfactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idfactura == null && other.idfactura != null) || (this.idfactura != null && !this.idfactura.equals(other.idfactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Factura[ idfactura=" + idfactura + " ]";
    }
    
}
