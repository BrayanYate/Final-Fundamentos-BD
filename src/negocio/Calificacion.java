package negocio;

import java.math.BigDecimal;

public class Calificacion {
    private int idCalificacion;
    private BigDecimal calificacion;
    private String observacion;
    private int idServicio;

    // Constructor
    public Calificacion(int idCalificacion, BigDecimal calificacion, String observacion, int idServicio) {
        this.idCalificacion = idCalificacion;
        this.calificacion = calificacion;
        this.observacion = observacion;
        this.idServicio = idServicio;
    }

    // Getters
    public int getIdCalificacion() {
        return idCalificacion;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    // Setters
    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

}
