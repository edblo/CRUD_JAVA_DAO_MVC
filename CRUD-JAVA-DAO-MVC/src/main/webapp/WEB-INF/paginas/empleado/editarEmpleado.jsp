<!DOCTYPE html>
<html lang="es">
    <head>
        <jsp:include page="/WEB-INF/paginas/comunes/headMeta.jsp"/>
        <title>Editar Empleado</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/paginas/comunes/cabecera.jsp"/>

        <form action="${pageContext.request.contextPath}/ServletControlador?action=modificar&idEmpleado=${empleado.idEmpleado}"
              method="POST" class="was-validated">
            
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavEdicion.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Empleado</h4>
                                </div>
                                <div class="card-body">
                                    <div hidden class="form-group">
                                        <label for="idEmpleado">id</label>
                                        <input type="text" class="form-control" name="idEmpleado" required value="${empleado.idEmpleado}"/>
                                    </div>   
                                    <div class="form-group">
                                        <label for="apellido">Apellido</label>
                                        <input type="text" class="form-control" name="apellido" required value="${empleado.apellido}"/>
                                    </div>                                    
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" required value="${empleado.nombre}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="dni">DNI</label>
                                        <input type="text" class="form-control" name="dni" required value="${empleado.dni}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" name="email" required value="${empleado.email}"/>
                                    </div>                                    
                                    <div class="form-group">
                                        <label for="telefono">Telefono</label>
                                        <input type="tel" class="form-control" name="telefono" required value="${empleado.telefono}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="fechaNac">Fecha de nacimiento</label>
                                        <input type="date" class="form-control" name="fechaNac" required value="${empleado.fechaNac}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="legajo">Legajo</label>
                                        <input type="text" class="form-control" name="legajo" required value="${empleado.legajo}"/>
                                    </div>                                    
                                    <div class="form-group">
                                        <label for="fechaIngreso">Fecha de ingreso</label>
                                        <input type="date" class="form-control" name="fechaIngreso" required value="${empleado.fechaIngreso}"/>
                                    </div>                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>

        <jsp:include page="/WEB-INF/paginas/comunes/pieDePagina.jsp"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>