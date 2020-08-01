/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import DAO.ClienteDao;

/**
 *
 * @author Alexander
 */
public class MainCliente {

    public MainCliente() {
    }
    public static void main(String[] args) {
        ClienteDao p = new ClienteDao();
        System.out.println(p.BuscarArticulo("Juan"));
    }
}
