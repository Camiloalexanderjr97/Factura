/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import DAO.FacturaDao;
import java.sql.SQLException;

/**
 *
 * @author Alexander
 */
public class MainFactura {

    public MainFactura() {
    }

    public static void main(String[] args) throws SQLException {
        FacturaDao p = new FacturaDao();
        
        System.out.println(p.ModificarFactura(p.BuscarFactura(90909)));
    }
}
