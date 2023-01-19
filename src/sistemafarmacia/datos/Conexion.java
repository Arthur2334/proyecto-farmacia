package sistemafarmacia.datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sistemafarmacia.VariablesFunciones;


public class Conexion {
    public static Connection getConexion()throws Exception{
        Connection cn = null;
        VariablesFunciones variables = new VariablesFunciones();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+variables.getBd()+"?noAccessToProcedureBodies=true&useSSL=false", variables.getUserbd(), variables.getPasswordbd());
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error conexión base de datos"+e.getMessage());
        }
        return cn;
    }
}
