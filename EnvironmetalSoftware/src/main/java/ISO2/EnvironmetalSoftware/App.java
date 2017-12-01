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
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/spotif", "root", "");
            Statement st = conexion.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM canciones;");
 
            if (rs != null) {
                System.out.println("El listado de la tabla clientes es:");
 
                while (rs.next()) {
                    System.out.println("  ID cancion: " + rs.getObject("id_cancion"));
                    System.out.println("  Titulo: " + rs.getObject("titulo"));
                    System.out.println("  ID album: " + rs.getObject("id_album"));
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

