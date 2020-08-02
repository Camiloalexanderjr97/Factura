/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import DAO.ArticuloDao;

/**
 *
 * @author Alexander
 */
public class MainArticulo {

    public MainArticulo() {
    }

    public static void main(String[] args) {
        ArticuloDao p = new ArticuloDao();
        System.out.println(p.llenarLista());
    }
}
