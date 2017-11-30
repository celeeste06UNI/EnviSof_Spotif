package Persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManejadorBD {
	
	private Connection conexion;
	
    public boolean conexion() {
    	boolean controlConexion= false;
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conexion = DriverManager.getConnection("jdbc:mysql://localhost/spotif", "root", "");
        
            controlConexion = true;
          
        }catch(SQLException s){
        	controlConexion = false;

        }catch(Exception s){
        	controlConexion = false;
        }
  
    	return controlConexion;
    }
    
    public ResultSet leer(String SQLquery){
    	
   	 	Statement st;
   	 	ResultSet rs = null;
   	 	
		try {
			st = conexion.createStatement();
			rs = st.executeQuery("SELECT * FROM canciones;");
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
   	return rs;
   }
    


    
}
