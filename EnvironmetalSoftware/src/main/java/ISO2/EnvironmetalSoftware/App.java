package ISO2.EnvironmetalSoftware;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://172.19.149.36/spotif", "root", "");
            Statement st = conexion.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM clientes;");
 
            if (rs != null) {
                System.out.println("El listado de la tabla clientes es:");
 
                while (rs.next()) {
                    System.out.println("  ID: " + rs.getObject("id"));
                    System.out.println("  Login: " + rs.getObject("login"));
                    System.out.println("  Contraseña: " + rs.getObject("contras"));
                }
                rs.close();
            }
            st.close();
 
        }
        catch(SQLException s)
        {
            System.out.println("Error: SQL.");
            System.out.println("SQLException: " + s.getMessage());
        }
        catch(Exception s)
        {
            System.out.println("Error: Varios.");
            System.out.println("SQLException: " + s.getMessage());
        }
    }
}

