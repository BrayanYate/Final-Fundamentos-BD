package negocio;

import java.math.BigDecimal;

public class PagoServicio {
    private int numeroReferencia;
    private BigDecimal valorPagado;
    private String formaPago;
    private int idServicio;

    // Constructor
    public PagoServicio(int numeroReferencia, BigDecimal valorPagado, String formaPago, int idServicio) {
        this.numeroReferencia = numeroReferencia;
        this.valorPagado = valorPagado;
        this.formaPago = formaPago;
        this.idServicio = idServicio;
    }

    // Getters
    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public BigDecimal getValorPagado() {
        return valorPagado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public int getIdServicio() {
        return idServicio;
    }

    // Setters
    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public void setValorPagado(BigDecimal valorPagado) {
        this.valorPagado = valorPagado;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

}
