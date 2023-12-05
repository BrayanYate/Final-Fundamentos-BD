package negocio;

public class Mensajero {
    //Clase donde se guardan los atributos del Mensajero.

    private String tipoId;
    private int idMensajero;
    private String nombre;
    private String apellido;
    private int telefono;
    private String f_nacimiento;
    private String nacionalidad;
    private String sexo;
    private String correo;
    private String contrasena;
    private String medioTransporte;
    private double calificacionPromedio;
    
    public Mensajero() {
    }
    public String getTipoId() {
        return tipoId;
    }
    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
    public int getIdMensajero() {
        return idMensajero;
    }
    public void setIdMensajero(int idMensajero) {
        this.idMensajero = idMensajero;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getF_nacimiento() {
        return f_nacimiento;
    }
    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getMedioTransporte() {
        return medioTransporte;
    }
    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }
    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }
    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }

    

}
