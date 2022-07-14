<div class="modal fade" id="agregarEmpleadoModal" tabindex="-1" aria-labelledby="agregarEmpleadoModal" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar empleado</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="${pageContext.request.contextPath}/ServletControlador?action=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control" name="apellido" required/>
                    </div>
                    <div class="form-group">                    
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required/>
                    </div>
                    <div class="form-group">                    
                        <label for="dni">DNI</label>
                        <input type="text" class="form-control" name="dni" required/>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required/>
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="text" class="form-control" name="telefono" required/>
                    </div>
                    <div class="form-group">
                        <label for="fechaNac">Fecha de nacimiento</label>
                        <input type="date" class="form-control" name="fechaNac" required/>
                    </div>
                    <div class="form-group">
                        <label for="legajo">Legajo</label>
                        <input type="text" class="form-control" name="legajo" required/>
                    </div>
                    <div class="form-group">
                        <label for="fechaIngreso">Fecha de ingreso</label>
                        <input type="date" class="form-control" name="fechaIngreso" required/>
                    </div>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>
            </form>
        </div>        
    </div>   
</div>
