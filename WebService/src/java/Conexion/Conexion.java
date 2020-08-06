/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author Alexander
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
    Connection con;
    Statement st;
   
    
    
    
     public  Connection Conexion(){
         try {
        //?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC
           
        String url = "jdbc:mysql://localhost/factura";
            String Driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String clave = "";
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, clave);
             System.out.println("Conexion");
        } catch (Exception e) {
            
            System.err.println("error en conexion" +e);
        }
        return con;
    }
     
    public void Desconectar(){
        try{
            con.close();
        }catch(Exception e){
            
        }
    } 
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.Conexion();
    }
    
}
