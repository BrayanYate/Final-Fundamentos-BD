package negocio;

public class Actividad {
    private int idServicio;
    private String idActividad;
    private String direccion;
    private String detallesDireccion;
    private String descripcionActividad;

    // Constructor
    public Actividad(int idServicio, String idActividad, String direccion, String detallesDireccion, String descripcionActividad) {
        this.idServicio = idServicio;
        this.idActividad = idActividad;
        this.direccion = direccion;
        this.detallesDireccion = detallesDireccion;
        this.descripcionActividad = descripcionActividad;
    }

    // Getters
    public int getIdServicio() {
        return idServicio;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDetallesDireccion() {
        return detallesDireccion;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    // Setters
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDetallesDireccion(String detallesDireccion) {
        this.detallesDireccion = detallesDireccion;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }


}
