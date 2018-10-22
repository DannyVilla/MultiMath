/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

/**
 *
 * @author sam
 */
public class Conexion {
    Connection conectar = null;
	    public Connection conexion(){ 
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	            System.out.println("Registrado");
	            System.out.println("");
	            
	            conectar=DriverManager.getConnection("jdbc:mysql://localhost/matematicas?" + "useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=Csgo1997" );
	        } catch(Exception ex){
                    System.out.println(ex + "Error en la conexion");
                    ex.printStackTrace();
                }
	         return conectar;  
	    }
            
	    public void cerrarConexion(){
	       try {
	           conectar.close();
	       } catch (SQLException ex) {
	            ex.printStackTrace(); 
	       }
	    }
}
