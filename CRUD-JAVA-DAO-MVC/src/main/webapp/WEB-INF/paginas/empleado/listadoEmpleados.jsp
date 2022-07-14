<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="es_AR"/>
<section id="empleados">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="table" style="border: solid; border-radius: 5px; border-width: 1px; padding: 5px; text-align: center">
                    <tr>
                        <td><h2>Listado de empleados</h2></td>
                    </tr>
                </div>
                <div>
                    <table class="table table-striped" style="border: solid; border-radius: 5px; border-width: 1px; padding: 5px; text-align: center">
                        <thead class="thead-dark" style="background-color: black; color:white">
                            <tr>
                                <th>#</th>
                                <th>Apellido</th>
                                <th>Nombre</th>
                                <th>DNI</th>
                                <th>Email</th>
                                <th>Telefono</th>
                                <th>Fecha de nacimiento</th>
                                <th>Legajo</th>
                                <th>Fecha de ingreso</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tr>
                            <c:forEach var="empleado" items="${empleados}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${empleado.apellido}</td>
                                    <td>${empleado.nombre}</td>
                                    <td>${empleado.dni}</td>
                                    <td>${empleado.email}</td>
                                    <td>${empleado.telefono}</td>
                                    <td>${empleado.fechaNac}</td>
                                    <td>${empleado.legajo}</td>
                                    <td>${empleado.fechaIngreso}</td>
                                    <td>
                                        
                                        <a href="${pageContext.request.contextPath}/ServletControlador?action=editar&idEmpleado=${empleado.idEmpleado}"
                                           class="btn btn-warning">
                                            <i class="fas fa-angle-double-right"></i>
                                            Editar
                                        </a>
                                        
                                    </td>
                                </tr>
                            </c:forEach>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>                        
<jsp:include page="/WEB-INF/paginas/empleado/agregarEmpleado.jsp"/>



