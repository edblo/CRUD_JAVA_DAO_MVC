package model;

public class Personal {
    private int idEmpleado;
    private String apellido;    
    private String nombre;
    private int dni;
    private String email;
    private String telefono;
    private String fechaNac;
    private int legajo;
    private String fechaIngreso;
    
    public Personal(){
        
    }
    
    public Personal(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

public Personal(String apellido, String nombre, int dni, String email, String telefono, String fechaNac, int legajo, String fechaIngreso) {
        this.apellido = apellido;    
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }

    public Personal(int idEmpleado, String apellido, String nombre, int dni, String email, String telefono, String fechaNac, int legajo, String fechaIngreso) {
        this.idEmpleado = idEmpleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    
}
