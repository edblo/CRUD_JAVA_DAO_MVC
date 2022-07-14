package web;

import model.Personal;
import data.EmpleadoDao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "editar":
                    editarEmpleado(request, response);
                    break;
                case "eliminar":
                    eliminarEmpleado(request, response);
                    break;
                default:
                    accionDefault(request, response);
            }
        } else {
            accionDefault(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "insertar":
                    agregarEmpleado(request, response);
                    break;
                case "modificar":
                    modificarEmpleado(request, response);
                    break;
                default:
                    accionDefault(request, response);
            }
        } else {
            accionDefault(request, response);
        }
    }

    private void accionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Personal> empleados = EmpleadoDao.listarEmpleados();
        HttpSession session = request.getSession();
        session.setAttribute("empleados", empleados);
        response.sendRedirect("empleados.jsp");
    }

    private void agregarEmpleado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String apellido = request.getParameter("apellido");
        String nombre = request.getParameter("nombre");
        int dni = Integer.parseInt(request.getParameter("dni"));
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String fechaNac = (request.getParameter("fechaNac"));
        int legajo = Integer.parseInt(request.getParameter("legajo"));
        String fechaIngreso = (request.getParameter("fechaIngreso"));

        EmpleadoDao.agregar(new Personal(apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso));

        accionDefault(request, response);
    }

    private void editarEmpleado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_Empleado = Integer.parseInt(request.getParameter("idEmpleado"));
        Personal empleado = new EmpleadoDao().encontrarEmpleado(id_Empleado);
        request.setAttribute("empleado", empleado);
        String jspEditar = "/WEB-INF/paginas/empleado/editarEmpleado.jsp";
        request.getRequestDispatcher(jspEditar).forward(request, response);
    }

    private void modificarEmpleado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int idEmpleado = Integer.parseInt(request.getParameter("idEmpleado"));
        String apellido = request.getParameter("apellido");
        String nombre = request.getParameter("nombre");
        int dni = Integer.parseInt(request.getParameter("dni"));
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String fechaNac = (request.getParameter("fechaNac"));
        int legajo = Integer.parseInt(request.getParameter("legajo"));
        String fechaIngreso = (request.getParameter("fechaIngreso"));
 
        EmpleadoDao.actualizar(new Personal(idEmpleado, apellido, nombre, dni, email, telefono, fechaNac, legajo, fechaIngreso));
        accionDefault(request, response);
    }

    private void eliminarEmpleado(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_Empleado = Integer.parseInt(request.getParameter("idEmpleado"));
        EmpleadoDao.eliminar(new Personal(id_Empleado));
        accionDefault(request, response);
    }
}
