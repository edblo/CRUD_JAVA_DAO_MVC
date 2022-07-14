<section id="action" class="py-4 mb-4 bg-light">
    <div class="container-flex">
        <div class="row">
            <div class="col-md-4">
                <a href="index.jsp" class="btn bg-light btn-block">
                    <i class="fas fa-arrow-left"></i>
                    Regresar al inicio
                </a>
            </div>
            <div class="col-md-4">
                <button type="submit" class="btn btn-success btn-block">
                    <i class="fas fa-check"></i>
                    Guardar empleado
                </button>
            </div>
            <div class="col-md-4">
                <a href="${pageContext.request.contextPath}/ServletControlador?action=eliminar&idEmpleado=${empleado.idEmpleado}"
                   class="btn btn-danger btn-block">
                    <i class="fas fa-trash"></i>
                    Eliminar empleado
                </a>
            </div>
        </div>
    </div>
</section>
