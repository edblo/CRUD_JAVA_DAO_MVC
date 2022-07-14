package data;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Personal;

public class EmpleadoDao {
    private static final String SQL_SELECT = "SELECT idEmpleado, apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso FROM empleados";
    private static final String SQL_SELECT_BY_ID = "SELECT idEmpleado, apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso FROM empleados WHERE idEmpleado = ?";
    private static final String SQL_INSERT = "INSERT INTO empleados(apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE empleados SET apellido = ?, nombre=?, dni = ?, email = ?, telefono = ?, fechaNac = ?, legajo = ?, fechaIngreso = ? WHERE idEmpleado = ?";
    private static final String SQL_DELETE = "DELETE FROM empleados WHERE idEmpleado = ?";
    
    public static List<Personal> listarEmpleados() {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        List<Personal> empleados = new ArrayList<>();
        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(SQL_SELECT);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                String apellido = rs.getString("apellido");
                String nombre = rs.getString("nombre");
                int dni = rs.getInt("dni");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String fechaNac = rs.getString("fechaNac");
                int legajo = rs.getInt("legajo");
                String fechaIngreso = rs.getString("fechaIngreso");
                
                empleados.add(new Personal(idEmpleado, apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso));

            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        } finally {
            Conexion.close(rs);
            Conexion.close(pst);
            Conexion.close(conn);
        }
        return empleados;
    }

    public Personal encontrarEmpleado(int id_empleado) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        Personal empleado = null;
        
        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(SQL_SELECT_BY_ID);
            pst.setInt(1, id_empleado);
            rs = pst.executeQuery();
            
            //rs.absolute(1);
            rs.next();

            int idEmpleado = Integer.parseInt(rs.getString("idEmpleado"));
            String apellido = rs.getString("apellido");
            String nombre = rs.getString("nombre");
            int dni = Integer.parseInt(rs.getString("dni"));
            String email = rs.getString("email");
            String telefono = rs.getString("telefono");
            String fechaNac = rs.getString("fechaNac");
            int legajo = Integer.parseInt(rs.getString("legajo"));
            String fechaIngreso = rs.getString("fechaIngreso");

            empleado = new Personal(idEmpleado, apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso);

        } catch (Exception ex) {
            System.out.println("Error " + ex);
        } finally {
            Conexion.close(rs);
            Conexion.close(pst);
            Conexion.close(conn);
        }
        return empleado;
    }
    
    public static void agregar(Personal empleado) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(SQL_INSERT);
            
            pst.setString(1, empleado.getApellido());
            pst.setString(2, empleado.getNombre());            
            pst.setInt(3, empleado.getDni());
            pst.setString(4, empleado.getEmail());
            pst.setString(5, empleado.getTelefono());
            pst.setString(6, empleado.getFechaNac());
            pst.setInt(7, empleado.getLegajo());
            pst.setString(8, empleado.getFechaIngreso());
            
            pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        } finally {
            Conexion.close(pst);
            Conexion.close(conn);
        }
    }
    
    public static void actualizar(Personal empleado) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(SQL_UPDATE);
            pst.setString(1, empleado.getApellido());
            pst.setString(2, empleado.getNombre());            
            pst.setInt(3, (empleado.getDni()));
            pst.setString(4, empleado.getEmail());
            pst.setString(5, empleado.getTelefono());
            pst.setString(6, empleado.getFechaNac());
            pst.setInt(7, empleado.getLegajo());
            pst.setString(8, empleado.getFechaIngreso());
            pst.setInt(9, empleado.getIdEmpleado());
            
            int registros = pst.executeUpdate();
            System.out.println("registros = " + registros);
            
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        } finally {
            Conexion.close(pst);
            Conexion.close(conn);
        }
    }
    
    public static void eliminar(Personal empleado) {
        Connection conn = null;
        PreparedStatement pst = null;
        
        try {
            conn = Conexion.getConexion();
            pst = conn.prepareStatement(SQL_DELETE);
            pst.setInt(1, empleado.getIdEmpleado());
            
            pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        } finally {
            Conexion.close(pst);
            Conexion.close(conn);
        }
    }
}
