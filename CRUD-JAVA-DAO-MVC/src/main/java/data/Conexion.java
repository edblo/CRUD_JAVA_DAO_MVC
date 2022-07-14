package data;

import java.sql.*;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/empleados?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "SQL_4dm1n";

    public static Connection getConexion() throws Exception{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception ex) {
            System.out.println("Error:"+ ex);
        }
    }

    public static void close(PreparedStatement pst) {
        try {
            pst.close();
        } catch (Exception ex) {
            System.out.println("Error:"+ ex);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception ex) {
            System.out.println("Error:"+ ex);
        }
    }
    
}
