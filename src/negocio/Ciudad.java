package negocio;

public class Ciudad {
    private int codigoPostal;
    private String nombre;
    private int porcentajeComision;

    // Constructor
    public Ciudad(int codigoPostal, String nombre, int porcentajeComision) {
        this.codigoPostal = codigoPostal;
        this.nombre = nombre;
        this.porcentajeComision = porcentajeComision;
    }

    // Getters
    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    // Setters
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

}
